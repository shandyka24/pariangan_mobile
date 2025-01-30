package b4a.DesaWisataSumpu;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class mapsrg_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (mapsrg) ","mapsrg",9,mapsrg.mostCurrent.activityBA,mapsrg.mostCurrent,31);
if (RapidSub.canDelegate("activity_create")) { return b4a.DesaWisataSumpu.mapsrg.remoteMe.runUserSub(false, "mapsrg","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 31;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 35;BA.debugLine="Starter.mapStatus = \"RG\"";
Debug.ShouldStop(4);
mapsrg.mostCurrent._starter._mapstatus /*RemoteObject*/  = BA.ObjectToString("RG");
 BA.debugLineNum = 36;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
Debug.ShouldStop(8);
mapsrg.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MainScrollView")),mapsrg.mostCurrent.activityBA);
 BA.debugLineNum = 37;BA.debugLine="MainScroll.Panel.LoadLayout(\"MapsRG\")";
Debug.ShouldStop(16);
mapsrg.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MapsRG")),mapsrg.mostCurrent.activityBA);
 BA.debugLineNum = 38;BA.debugLine="Navbar.Visible = False";
Debug.ShouldStop(32);
mapsrg.mostCurrent._navbar.runMethod(true,"setVisible",mapsrg.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 39;BA.debugLine="If Navbar.Visible == False Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",mapsrg.mostCurrent._navbar.runMethod(true,"getVisible"),mapsrg.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 40;BA.debugLine="MainScroll.Top = MainScroll.Top - Navbar.Height";
Debug.ShouldStop(128);
mapsrg.mostCurrent._mainscroll.runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {mapsrg.mostCurrent._mainscroll.runMethod(true,"getTop"),mapsrg.mostCurrent._navbar.runMethod(true,"getHeight")}, "-",1, 1));
 BA.debugLineNum = 41;BA.debugLine="MainScroll.Height = MainScroll.Height + Navbar.H";
Debug.ShouldStop(256);
mapsrg.mostCurrent._mainscroll.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {mapsrg.mostCurrent._mainscroll.runMethod(true,"getHeight"),mapsrg.mostCurrent._navbar.runMethod(true,"getHeight")}, "+",1, 1));
 };
 BA.debugLineNum = 43;BA.debugLine="WebViewRG.Height = MainScroll.Height";
Debug.ShouldStop(1024);
mapsrg.mostCurrent._webviewrg.runMethod(true,"setHeight",mapsrg.mostCurrent._mainscroll.runMethod(true,"getHeight"));
 BA.debugLineNum = 44;BA.debugLine="PanelRG.Height = MainScroll.Height";
Debug.ShouldStop(2048);
mapsrg.mostCurrent._panelrg.runMethod(true,"setHeight",mapsrg.mostCurrent._mainscroll.runMethod(true,"getHeight"));
 BA.debugLineNum = 45;BA.debugLine="MainScroll.Panel.Height = MainScroll.Height";
Debug.ShouldStop(4096);
mapsrg.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethod(true,"setHeight",mapsrg.mostCurrent._mainscroll.runMethod(true,"getHeight"));
 BA.debugLineNum = 47;BA.debugLine="MyWebViewExtras.addWebChromeClient(WebViewRG, \"We";
Debug.ShouldStop(16384);
mapsrg.mostCurrent._mywebviewextras.runVoidMethod ("addWebChromeClient",mapsrg.mostCurrent.activityBA,(Object)((mapsrg.mostCurrent._webviewrg.getObject())),(Object)(RemoteObject.createImmutable("WebViewRG")));
 BA.debugLineNum = 48;BA.debugLine="WebViewRG.JavaScriptEnabled = True";
Debug.ShouldStop(32768);
mapsrg.mostCurrent._webviewrg.runMethod(true,"setJavaScriptEnabled",mapsrg.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 49;BA.debugLine="WebViewRG.LoadUrl(Main.server&\"web/list_homestay_";
Debug.ShouldStop(65536);
mapsrg.mostCurrent._webviewrg.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(mapsrg.mostCurrent._main._server /*RemoteObject*/ ,RemoteObject.createImmutable("web/list_homestay_mobile"))));
 BA.debugLineNum = 51;BA.debugLine="btnObj.Visible = False";
Debug.ShouldStop(262144);
mapsrg.mostCurrent._btnobj.runMethod(true,"setVisible",mapsrg.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 52;BA.debugLine="btnUserLoc.Visible = False";
Debug.ShouldStop(524288);
mapsrg.mostCurrent._btnuserloc.runMethod(true,"setVisible",mapsrg.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 53;BA.debugLine="btnList.Visible = False";
Debug.ShouldStop(1048576);
mapsrg.mostCurrent._btnlist.runMethod(true,"setVisible",mapsrg.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 54;BA.debugLine="btnList2.Visible = False";
Debug.ShouldStop(2097152);
mapsrg.mostCurrent._btnlist2.runMethod(true,"setVisible",mapsrg.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 57;BA.debugLine="Core.ExecuteUrlGet(Main.API&\"facility\", \"LoadFaci";
Debug.ShouldStop(16777216);
mapsrg.mostCurrent._core.runVoidMethod ("_executeurlget" /*RemoteObject*/ ,mapsrg.mostCurrent.activityBA,(Object)(RemoteObject.concat(mapsrg.mostCurrent._main._api /*RemoteObject*/ ,RemoteObject.createImmutable("facility"))),(Object)(BA.ObjectToString("LoadFacility")),(Object)(mapsrg.getObject()));
 BA.debugLineNum = 58;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (mapsrg) ","mapsrg",9,mapsrg.mostCurrent.activityBA,mapsrg.mostCurrent,77);
if (RapidSub.canDelegate("activity_pause")) { return b4a.DesaWisataSumpu.mapsrg.remoteMe.runUserSub(false, "mapsrg","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 77;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 78;BA.debugLine="CallSubDelayed(Starter, \"StopGPS\")";
Debug.ShouldStop(8192);
mapsrg.mostCurrent.__c.runVoidMethod ("CallSubDelayed",mapsrg.processBA,(Object)((mapsrg.mostCurrent._starter.getObject())),(Object)(RemoteObject.createImmutable("StopGPS")));
 BA.debugLineNum = 79;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (mapsrg) ","mapsrg",9,mapsrg.mostCurrent.activityBA,mapsrg.mostCurrent,60);
if (RapidSub.canDelegate("activity_resume")) { b4a.DesaWisataSumpu.mapsrg.remoteMe.runUserSub(false, "mapsrg","activity_resume"); return;}
ResumableSub_Activity_Resume rsub = new ResumableSub_Activity_Resume(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Activity_Resume extends BA.ResumableSub {
public ResumableSub_Activity_Resume(b4a.DesaWisataSumpu.mapsrg parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.DesaWisataSumpu.mapsrg parent;
RemoteObject _permission = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (mapsrg) ","mapsrg",9,mapsrg.mostCurrent.activityBA,mapsrg.mostCurrent,60);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 61;BA.debugLine="Log(\"MapsRG Loaded\")";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","25308417",RemoteObject.createImmutable("MapsRG Loaded"),0);
 BA.debugLineNum = 62;BA.debugLine="If Starter.GPS1.GPSEnabled = False Then";
Debug.ShouldStop(536870912);
if (true) break;

case 1:
//if
this.state = 12;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._starter._gps1 /*RemoteObject*/ .runMethod(true,"getGPSEnabled"),parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 12;
 BA.debugLineNum = 63;BA.debugLine="ToastMessageShow(\"Please enable the GPS device.\"";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Please enable the GPS device.")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 64;BA.debugLine="StartActivity(Starter.GPS1.LocationSettingsInten";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",mapsrg.processBA,(Object)((parent.mostCurrent._starter._gps1 /*RemoteObject*/ .runMethod(false,"getLocationSettingsIntent"))));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 66;BA.debugLine="Starter.rp.CheckAndRequest(Starter.rp.PERMISSION";
Debug.ShouldStop(2);
parent.mostCurrent._starter._rp /*RemoteObject*/ .runVoidMethod ("CheckAndRequest",mapsrg.processBA,(Object)(parent.mostCurrent._starter._rp /*RemoteObject*/ .getField(true,"PERMISSION_ACCESS_FINE_LOCATION")));
 BA.debugLineNum = 67;BA.debugLine="Wait For Activity_PermissionResult (Permission A";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","activity_permissionresult", mapsrg.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mapsrg", "activity_resume"), null);
this.state = 13;
return;
case 13:
//C
this.state = 6;
_permission = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Permission", _permission);
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 68;BA.debugLine="If Result Then";
Debug.ShouldStop(8);
if (true) break;

case 6:
//if
this.state = 11;
if (_result.<Boolean>get().booleanValue()) { 
this.state = 8;
}else {
this.state = 10;
}if (true) break;

case 8:
//C
this.state = 11;
 BA.debugLineNum = 69;BA.debugLine="CallSubDelayed(Starter, \"StartGPS\")";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("CallSubDelayed",mapsrg.processBA,(Object)((parent.mostCurrent._starter.getObject())),(Object)(RemoteObject.createImmutable("StartGPS")));
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 71;BA.debugLine="ToastMessageShow(\"Please allow GPS to run this";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Please allow GPS to run this appliation")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 72;BA.debugLine="Activity.Finish";
Debug.ShouldStop(128);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 if (true) break;

case 11:
//C
this.state = 12;
;
 if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 75;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _activity_permissionresult(RemoteObject _permission,RemoteObject _result) throws Exception{
}
public static RemoteObject  _btnback_click() throws Exception{
try {
		Debug.PushSubsStack("BtnBack_Click (mapsrg) ","mapsrg",9,mapsrg.mostCurrent.activityBA,mapsrg.mostCurrent,81);
if (RapidSub.canDelegate("btnback_click")) { return b4a.DesaWisataSumpu.mapsrg.remoteMe.runUserSub(false, "mapsrg","btnback_click");}
 BA.debugLineNum = 81;BA.debugLine="Private Sub BtnBack_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 82;BA.debugLine="Log(\"Going back to previous activity\")";
Debug.ShouldStop(131072);
mapsrg.mostCurrent.__c.runVoidMethod ("LogImpl","25439489",RemoteObject.createImmutable("Going back to previous activity"),0);
 BA.debugLineNum = 83;BA.debugLine="Starter.mapStatus = \"\"";
Debug.ShouldStop(262144);
mapsrg.mostCurrent._starter._mapstatus /*RemoteObject*/  = BA.ObjectToString("");
 BA.debugLineNum = 84;BA.debugLine="Activity.Finish";
Debug.ShouldStop(524288);
mapsrg.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 85;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnlist_click() throws Exception{
try {
		Debug.PushSubsStack("btnList_Click (mapsrg) ","mapsrg",9,mapsrg.mostCurrent.activityBA,mapsrg.mostCurrent,161);
if (RapidSub.canDelegate("btnlist_click")) { return b4a.DesaWisataSumpu.mapsrg.remoteMe.runUserSub(false, "mapsrg","btnlist_click");}
 BA.debugLineNum = 161;BA.debugLine="Private Sub btnList_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 162;BA.debugLine="Log(\"Redirect to ListRG activity\")";
Debug.ShouldStop(2);
mapsrg.mostCurrent.__c.runVoidMethod ("LogImpl","25898241",RemoteObject.createImmutable("Redirect to ListRG activity"),0);
 BA.debugLineNum = 163;BA.debugLine="StartActivity(ListRG)";
Debug.ShouldStop(4);
mapsrg.mostCurrent.__c.runVoidMethod ("StartActivity",mapsrg.processBA,(Object)((mapsrg.mostCurrent._listrg.getObject())));
 BA.debugLineNum = 164;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnlist2_click() throws Exception{
try {
		Debug.PushSubsStack("btnList2_Click (mapsrg) ","mapsrg",9,mapsrg.mostCurrent.activityBA,mapsrg.mostCurrent,166);
if (RapidSub.canDelegate("btnlist2_click")) { return b4a.DesaWisataSumpu.mapsrg.remoteMe.runUserSub(false, "mapsrg","btnlist2_click");}
 BA.debugLineNum = 166;BA.debugLine="Private Sub btnList2_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 167;BA.debugLine="Log(\"Redirect to ListRG activity\")";
Debug.ShouldStop(64);
mapsrg.mostCurrent.__c.runVoidMethod ("LogImpl","25963777",RemoteObject.createImmutable("Redirect to ListRG activity"),0);
 BA.debugLineNum = 168;BA.debugLine="StartActivity(ListRG)";
Debug.ShouldStop(128);
mapsrg.mostCurrent.__c.runVoidMethod ("StartActivity",mapsrg.processBA,(Object)((mapsrg.mostCurrent._listrg.getObject())));
 BA.debugLineNum = 169;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnobj_click() throws Exception{
try {
		Debug.PushSubsStack("btnObj_Click (mapsrg) ","mapsrg",9,mapsrg.mostCurrent.activityBA,mapsrg.mostCurrent,116);
if (RapidSub.canDelegate("btnobj_click")) { return b4a.DesaWisataSumpu.mapsrg.remoteMe.runUserSub(false, "mapsrg","btnobj_click");}
RemoteObject _boundtoobject = RemoteObject.createImmutable("");
 BA.debugLineNum = 116;BA.debugLine="Private Sub btnObj_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 117;BA.debugLine="Log(\"Pan to Rumah Gadang\")";
Debug.ShouldStop(1048576);
mapsrg.mostCurrent.__c.runVoidMethod ("LogImpl","25701633",RemoteObject.createImmutable("Pan to Rumah Gadang"),0);
 BA.debugLineNum = 118;BA.debugLine="Dim boundToObject As String";
Debug.ShouldStop(2097152);
_boundtoobject = RemoteObject.createImmutable("");Debug.locals.put("boundToObject", _boundtoobject);
 BA.debugLineNum = 119;BA.debugLine="If isFiltered Then";
Debug.ShouldStop(4194304);
if (mapsrg._isfiltered.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 120;BA.debugLine="boundToObject = \"findRG('')\"";
Debug.ShouldStop(8388608);
_boundtoobject = BA.ObjectToString("findRG('')");Debug.locals.put("boundToObject", _boundtoobject);
 BA.debugLineNum = 121;BA.debugLine="isFiltered = False";
Debug.ShouldStop(16777216);
mapsrg._isfiltered = mapsrg.mostCurrent.__c.getField(true,"False");
 }else {
 BA.debugLineNum = 123;BA.debugLine="boundToObject = \"boundToObject(false)\"";
Debug.ShouldStop(67108864);
_boundtoobject = BA.ObjectToString("boundToObject(false)");Debug.locals.put("boundToObject", _boundtoobject);
 };
 BA.debugLineNum = 125;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewRG, boun";
Debug.ShouldStop(268435456);
mapsrg.mostCurrent._mywebviewextras.runVoidMethod ("executeJavascript",(Object)((mapsrg.mostCurrent._webviewrg.getObject())),(Object)(_boundtoobject));
 BA.debugLineNum = 126;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnuserloc_click() throws Exception{
try {
		Debug.PushSubsStack("btnUserLoc_Click (mapsrg) ","mapsrg",9,mapsrg.mostCurrent.activityBA,mapsrg.mostCurrent,109);
if (RapidSub.canDelegate("btnuserloc_click")) { return b4a.DesaWisataSumpu.mapsrg.remoteMe.runUserSub(false, "mapsrg","btnuserloc_click");}
RemoteObject _pantouser = RemoteObject.createImmutable("");
 BA.debugLineNum = 109;BA.debugLine="Private Sub btnUserLoc_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 110;BA.debugLine="Log(\"Panning to user location\")";
Debug.ShouldStop(8192);
mapsrg.mostCurrent.__c.runVoidMethod ("LogImpl","25636097",RemoteObject.createImmutable("Panning to user location"),0);
 BA.debugLineNum = 111;BA.debugLine="UpdateLocation";
Debug.ShouldStop(16384);
_updatelocation();
 BA.debugLineNum = 112;BA.debugLine="Dim panToUser As String = \"panToUser()\"";
Debug.ShouldStop(32768);
_pantouser = BA.ObjectToString("panToUser()");Debug.locals.put("panToUser", _pantouser);Debug.locals.put("panToUser", _pantouser);
 BA.debugLineNum = 113;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewRG, panT";
Debug.ShouldStop(65536);
mapsrg.mostCurrent._mywebviewextras.runVoidMethod ("executeJavascript",(Object)((mapsrg.mostCurrent._webviewrg.getObject())),(Object)(_pantouser));
 BA.debugLineNum = 114;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 14;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 18;BA.debugLine="Private MyWebViewExtras As WebViewExtras";
mapsrg.mostCurrent._mywebviewextras = RemoteObject.createNew ("uk.co.martinpearman.b4a.webviewextras.WebViewExtras");
 //BA.debugLineNum = 19;BA.debugLine="Private MyWebViewSettings As WebViewSettings";
mapsrg.mostCurrent._mywebviewsettings = RemoteObject.createNew ("uk.co.martinpearman.b4a.webviewsettings.WebViewSettings");
 //BA.debugLineNum = 20;BA.debugLine="Private PanelRG As Panel";
mapsrg.mostCurrent._panelrg = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private WebViewRG As WebView";
mapsrg.mostCurrent._webviewrg = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private BtnBack As Button";
mapsrg.mostCurrent._btnback = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private Navbar As Panel";
mapsrg.mostCurrent._navbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private MainScroll As ScrollView";
mapsrg.mostCurrent._mainscroll = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private btnUserLoc As Button";
mapsrg.mostCurrent._btnuserloc = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private btnObj As Button";
mapsrg.mostCurrent._btnobj = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private btnList As Button";
mapsrg.mostCurrent._btnlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private btnList2 As Button";
mapsrg.mostCurrent._btnlist2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (mapsrg) ","mapsrg",9,mapsrg.mostCurrent.activityBA,mapsrg.mostCurrent,129);
if (RapidSub.canDelegate("jobdone")) { return b4a.DesaWisataSumpu.mapsrg.remoteMe.runUserSub(false, "mapsrg","jobdone", _job);}
RemoteObject _res = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _data = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _facility = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 129;BA.debugLine="Sub JobDone (Job As HttpJob)";
Debug.ShouldStop(1);
 BA.debugLineNum = 130;BA.debugLine="Log(\"JobName = \" & Job.JobName & \", Success = \" &";
Debug.ShouldStop(2);
mapsrg.mostCurrent.__c.runVoidMethod ("LogImpl","25767169",RemoteObject.concat(RemoteObject.createImmutable("JobName = "),_job.getField(true,"_jobname" /*RemoteObject*/ ),RemoteObject.createImmutable(", Success = "),_job.getField(true,"_success" /*RemoteObject*/ )),0);
 BA.debugLineNum = 131;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(4);
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 132;BA.debugLine="Dim res As String";
Debug.ShouldStop(8);
_res = RemoteObject.createImmutable("");Debug.locals.put("res", _res);
 BA.debugLineNum = 133;BA.debugLine="res = Job.GetString";
Debug.ShouldStop(16);
_res = _job.runClassMethod (b4a.DesaWisataSumpu.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("res", _res);
 BA.debugLineNum = 134;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(32);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 135;BA.debugLine="parser.Initialize(res)";
Debug.ShouldStop(64);
_parser.runVoidMethod ("Initialize",(Object)(_res));
 BA.debugLineNum = 137;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(256);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname" /*RemoteObject*/ ),BA.ObjectToString("LoadFacility"))) {
case 0: {
 BA.debugLineNum = 139;BA.debugLine="Try";
Debug.ShouldStop(1024);
try { BA.debugLineNum = 140;BA.debugLine="Dim map As Map";
Debug.ShouldStop(2048);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("map", _map);
 BA.debugLineNum = 141;BA.debugLine="map = parser.NextObject";
Debug.ShouldStop(4096);
_map = _parser.runMethod(false,"NextObject");Debug.locals.put("map", _map);
 BA.debugLineNum = 142;BA.debugLine="Dim data As List";
Debug.ShouldStop(8192);
_data = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("data", _data);
 BA.debugLineNum = 143;BA.debugLine="data = map.Get(\"data\")";
Debug.ShouldStop(16384);
_data = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("data")))));Debug.locals.put("data", _data);
 BA.debugLineNum = 144;BA.debugLine="facilityMap.Initialize";
Debug.ShouldStop(32768);
mapsrg._facilitymap.runVoidMethod ("Initialize");
 BA.debugLineNum = 145;BA.debugLine="For i = 0 To data.Size - 1";
Debug.ShouldStop(65536);
{
final int step15 = 1;
final int limit15 = RemoteObject.solve(new RemoteObject[] {_data.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step15 > 0 && _i <= limit15) || (step15 < 0 && _i >= limit15) ;_i = ((int)(0 + _i + step15))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 146;BA.debugLine="Dim facility As Map";
Debug.ShouldStop(131072);
_facility = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("facility", _facility);
 BA.debugLineNum = 147;BA.debugLine="facility = data.Get(i)";
Debug.ShouldStop(262144);
_facility = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _data.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("facility", _facility);
 BA.debugLineNum = 148;BA.debugLine="facilityMap.Put(facility.Get(\"facility\"), fa";
Debug.ShouldStop(524288);
mapsrg._facilitymap.runVoidMethod ("Put",(Object)(_facility.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("facility"))))),(Object)(_facility.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))));
 }
}Debug.locals.put("i", _i);
;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e21) {
			BA.rdebugUtils.runVoidMethod("setLastException",mapsrg.processBA, e21.toString()); BA.debugLineNum = 151;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4194304);
mapsrg.mostCurrent.__c.runVoidMethod ("LogImpl","25767190",BA.ObjectToString(mapsrg.mostCurrent.__c.runMethod(false,"LastException",mapsrg.mostCurrent.activityBA)),0);
 };
 break; }
}
;
 };
 BA.debugLineNum = 155;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Dim nameRG As String";
mapsrg._namerg = RemoteObject.createImmutable("");
 //BA.debugLineNum = 10;BA.debugLine="Dim facilityMap As Map";
mapsrg._facilitymap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 11;BA.debugLine="Dim isFiltered As Boolean = False";
mapsrg._isfiltered = mapsrg.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _updatelocation() throws Exception{
try {
		Debug.PushSubsStack("UpdateLocation (mapsrg) ","mapsrg",9,mapsrg.mostCurrent.activityBA,mapsrg.mostCurrent,87);
if (RapidSub.canDelegate("updatelocation")) { return b4a.DesaWisataSumpu.mapsrg.remoteMe.runUserSub(false, "mapsrg","updatelocation");}
RemoteObject _userposition = RemoteObject.createImmutable("");
 BA.debugLineNum = 87;BA.debugLine="Public Sub UpdateLocation";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 88;BA.debugLine="Log(\"Update user position on Maps Rumah Gadang\")";
Debug.ShouldStop(8388608);
mapsrg.mostCurrent.__c.runVoidMethod ("LogImpl","25505025",RemoteObject.createImmutable("Update user position on Maps Rumah Gadang"),0);
 BA.debugLineNum = 89;BA.debugLine="Log(\"Lat: \"&Starter.lat&\"; Long: \"&Starter.lng)";
Debug.ShouldStop(16777216);
mapsrg.mostCurrent.__c.runVoidMethod ("LogImpl","25505026",RemoteObject.concat(RemoteObject.createImmutable("Lat: "),mapsrg.mostCurrent._starter._lat /*RemoteObject*/ ,RemoteObject.createImmutable("; Long: "),mapsrg.mostCurrent._starter._lng /*RemoteObject*/ ),0);
 BA.debugLineNum = 90;BA.debugLine="Dim userPosition As String";
Debug.ShouldStop(33554432);
_userposition = RemoteObject.createImmutable("");Debug.locals.put("userPosition", _userposition);
 BA.debugLineNum = 91;BA.debugLine="userPosition = \"userPositionAPI(\"&Starter.lat&\",";
Debug.ShouldStop(67108864);
_userposition = RemoteObject.concat(RemoteObject.createImmutable("userPositionAPI("),mapsrg.mostCurrent._starter._lat /*RemoteObject*/ ,RemoteObject.createImmutable(", "),mapsrg.mostCurrent._starter._lng /*RemoteObject*/ ,RemoteObject.createImmutable(")"));Debug.locals.put("userPosition", _userposition);
 BA.debugLineNum = 92;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewRG, user";
Debug.ShouldStop(134217728);
mapsrg.mostCurrent._mywebviewextras.runVoidMethod ("executeJavascript",(Object)((mapsrg.mostCurrent._webviewrg.getObject())),(Object)(_userposition));
 BA.debugLineNum = 93;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _webviewrg_pagefinished(RemoteObject _url) throws Exception{
try {
		Debug.PushSubsStack("WebViewRG_PageFinished (mapsrg) ","mapsrg",9,mapsrg.mostCurrent.activityBA,mapsrg.mostCurrent,157);
if (RapidSub.canDelegate("webviewrg_pagefinished")) { return b4a.DesaWisataSumpu.mapsrg.remoteMe.runUserSub(false, "mapsrg","webviewrg_pagefinished", _url);}
Debug.locals.put("Url", _url);
 BA.debugLineNum = 157;BA.debugLine="Private Sub WebViewRG_PageFinished (Url As String)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 159;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _webviewrg_progresschanged(RemoteObject _loading) throws Exception{
try {
		Debug.PushSubsStack("WebViewRG_ProgressChanged (mapsrg) ","mapsrg",9,mapsrg.mostCurrent.activityBA,mapsrg.mostCurrent,95);
if (RapidSub.canDelegate("webviewrg_progresschanged")) { return b4a.DesaWisataSumpu.mapsrg.remoteMe.runUserSub(false, "mapsrg","webviewrg_progresschanged", _loading);}
Debug.locals.put("loading", _loading);
 BA.debugLineNum = 95;BA.debugLine="Sub WebViewRG_ProgressChanged(loading As Int)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 96;BA.debugLine="If loading == 100 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_loading,BA.numberCast(double.class, 100))) { 
 BA.debugLineNum = 97;BA.debugLine="Log(\"Webview loaded\")";
Debug.ShouldStop(1);
mapsrg.mostCurrent.__c.runVoidMethod ("LogImpl","25570562",RemoteObject.createImmutable("Webview loaded"),0);
 BA.debugLineNum = 98;BA.debugLine="Starter.webviewLoading = loading";
Debug.ShouldStop(2);
mapsrg.mostCurrent._starter._webviewloading /*RemoteObject*/  = _loading;
 BA.debugLineNum = 99;BA.debugLine="btnObj.Visible = True";
Debug.ShouldStop(4);
mapsrg.mostCurrent._btnobj.runMethod(true,"setVisible",mapsrg.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 100;BA.debugLine="btnUserLoc.Visible = True";
Debug.ShouldStop(8);
mapsrg.mostCurrent._btnuserloc.runMethod(true,"setVisible",mapsrg.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 101;BA.debugLine="btnList.Visible = True";
Debug.ShouldStop(16);
mapsrg.mostCurrent._btnlist.runMethod(true,"setVisible",mapsrg.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 102;BA.debugLine="btnList2.Visible = True";
Debug.ShouldStop(32);
mapsrg.mostCurrent._btnlist2.runMethod(true,"setVisible",mapsrg.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 103;BA.debugLine="UpdateLocation";
Debug.ShouldStop(64);
_updatelocation();
 }else {
 BA.debugLineNum = 105;BA.debugLine="Log(\"Webview loading at \"&loading&\"% ....\")";
Debug.ShouldStop(256);
mapsrg.mostCurrent.__c.runVoidMethod ("LogImpl","25570570",RemoteObject.concat(RemoteObject.createImmutable("Webview loading at "),_loading,RemoteObject.createImmutable("% ....")),0);
 };
 BA.debugLineNum = 107;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}