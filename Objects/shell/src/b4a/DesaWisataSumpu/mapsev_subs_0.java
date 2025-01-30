package b4a.DesaWisataSumpu;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class mapsev_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (mapsev) ","mapsev",8,mapsev.mostCurrent.activityBA,mapsev.mostCurrent,35);
if (RapidSub.canDelegate("activity_create")) { return b4a.DesaWisataSumpu.mapsev.remoteMe.runUserSub(false, "mapsev","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 35;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(4);
 BA.debugLineNum = 39;BA.debugLine="Starter.mapStatus = \"EV\"";
Debug.ShouldStop(64);
mapsev.mostCurrent._starter._mapstatus /*RemoteObject*/  = BA.ObjectToString("EV");
 BA.debugLineNum = 40;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
Debug.ShouldStop(128);
mapsev.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MainScrollView")),mapsev.mostCurrent.activityBA);
 BA.debugLineNum = 41;BA.debugLine="MainScroll.Panel.LoadLayout(\"MapsEV\")";
Debug.ShouldStop(256);
mapsev.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MapsEV")),mapsev.mostCurrent.activityBA);
 BA.debugLineNum = 42;BA.debugLine="Navbar.Visible = False";
Debug.ShouldStop(512);
mapsev.mostCurrent._navbar.runMethod(true,"setVisible",mapsev.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 43;BA.debugLine="If Navbar.Visible == False Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",mapsev.mostCurrent._navbar.runMethod(true,"getVisible"),mapsev.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 44;BA.debugLine="MainScroll.Top = MainScroll.Top - Navbar.Height";
Debug.ShouldStop(2048);
mapsev.mostCurrent._mainscroll.runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {mapsev.mostCurrent._mainscroll.runMethod(true,"getTop"),mapsev.mostCurrent._navbar.runMethod(true,"getHeight")}, "-",1, 1));
 BA.debugLineNum = 45;BA.debugLine="MainScroll.Height = MainScroll.Height + Navbar.H";
Debug.ShouldStop(4096);
mapsev.mostCurrent._mainscroll.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {mapsev.mostCurrent._mainscroll.runMethod(true,"getHeight"),mapsev.mostCurrent._navbar.runMethod(true,"getHeight")}, "+",1, 1));
 };
 BA.debugLineNum = 47;BA.debugLine="WebViewEV.Height = MainScroll.Height";
Debug.ShouldStop(16384);
mapsev.mostCurrent._webviewev.runMethod(true,"setHeight",mapsev.mostCurrent._mainscroll.runMethod(true,"getHeight"));
 BA.debugLineNum = 48;BA.debugLine="PanelEV.Height = MainScroll.Height";
Debug.ShouldStop(32768);
mapsev.mostCurrent._panelev.runMethod(true,"setHeight",mapsev.mostCurrent._mainscroll.runMethod(true,"getHeight"));
 BA.debugLineNum = 49;BA.debugLine="MainScroll.Panel.Height = MainScroll.Height";
Debug.ShouldStop(65536);
mapsev.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethod(true,"setHeight",mapsev.mostCurrent._mainscroll.runMethod(true,"getHeight"));
 BA.debugLineNum = 51;BA.debugLine="MyWebViewExtras.addWebChromeClient(WebViewEV, \"We";
Debug.ShouldStop(262144);
mapsev.mostCurrent._mywebviewextras.runVoidMethod ("addWebChromeClient",mapsev.mostCurrent.activityBA,(Object)((mapsev.mostCurrent._webviewev.getObject())),(Object)(RemoteObject.createImmutable("WebViewEV")));
 BA.debugLineNum = 52;BA.debugLine="WebViewEV.JavaScriptEnabled = True";
Debug.ShouldStop(524288);
mapsev.mostCurrent._webviewev.runMethod(true,"setJavaScriptEnabled",mapsev.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 53;BA.debugLine="WebViewEV.LoadUrl(Main.server&\"web/attraction/map";
Debug.ShouldStop(1048576);
mapsev.mostCurrent._webviewev.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(mapsev.mostCurrent._main._server /*RemoteObject*/ ,RemoteObject.createImmutable("web/attraction/maps"))));
 BA.debugLineNum = 55;BA.debugLine="btnObj.Visible = False";
Debug.ShouldStop(4194304);
mapsev.mostCurrent._btnobj.runMethod(true,"setVisible",mapsev.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 56;BA.debugLine="btnUserLoc.Visible = False";
Debug.ShouldStop(8388608);
mapsev.mostCurrent._btnuserloc.runMethod(true,"setVisible",mapsev.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 57;BA.debugLine="btnList.Visible = False";
Debug.ShouldStop(16777216);
mapsev.mostCurrent._btnlist.runMethod(true,"setVisible",mapsev.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 58;BA.debugLine="btnList2.Visible = False";
Debug.ShouldStop(33554432);
mapsev.mostCurrent._btnlist2.runMethod(true,"setVisible",mapsev.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 61;BA.debugLine="Dialog.Initialize (Activity)";
Debug.ShouldStop(268435456);
mapsev.mostCurrent._dialog.runClassMethod (b4a.DesaWisataSumpu.b4xdialog.class, "_initialize" /*RemoteObject*/ ,mapsev.mostCurrent.activityBA,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), mapsev.mostCurrent._activity.getObject()));
 BA.debugLineNum = 62;BA.debugLine="Dialog.Title = \"Select Date...\"";
Debug.ShouldStop(536870912);
mapsev.mostCurrent._dialog.setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Select Date...")));
 BA.debugLineNum = 63;BA.debugLine="DateTemplate.Initialize";
Debug.ShouldStop(1073741824);
mapsev.mostCurrent._datetemplate.runClassMethod (b4a.DesaWisataSumpu.b4xdatetemplate.class, "_initialize" /*RemoteObject*/ ,mapsev.mostCurrent.activityBA);
 BA.debugLineNum = 64;BA.debugLine="DateTemplate.MinYear = 2000";
Debug.ShouldStop(-2147483648);
mapsev.mostCurrent._datetemplate.setField ("_minyear" /*RemoteObject*/ ,BA.numberCast(int.class, 2000));
 BA.debugLineNum = 65;BA.debugLine="DateTemplate.MaxYear = 2050";
Debug.ShouldStop(1);
mapsev.mostCurrent._datetemplate.setField ("_maxyear" /*RemoteObject*/ ,BA.numberCast(int.class, 2050));
 BA.debugLineNum = 66;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("Activity_Pause (mapsev) ","mapsev",8,mapsev.mostCurrent.activityBA,mapsev.mostCurrent,85);
if (RapidSub.canDelegate("activity_pause")) { return b4a.DesaWisataSumpu.mapsev.remoteMe.runUserSub(false, "mapsev","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 85;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 86;BA.debugLine="CallSubDelayed(Starter, \"StopGPS\")";
Debug.ShouldStop(2097152);
mapsev.mostCurrent.__c.runVoidMethod ("CallSubDelayed",mapsev.processBA,(Object)((mapsev.mostCurrent._starter.getObject())),(Object)(RemoteObject.createImmutable("StopGPS")));
 BA.debugLineNum = 87;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("Activity_Resume (mapsev) ","mapsev",8,mapsev.mostCurrent.activityBA,mapsev.mostCurrent,68);
if (RapidSub.canDelegate("activity_resume")) { b4a.DesaWisataSumpu.mapsev.remoteMe.runUserSub(false, "mapsev","activity_resume"); return;}
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
public ResumableSub_Activity_Resume(b4a.DesaWisataSumpu.mapsev parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.DesaWisataSumpu.mapsev parent;
RemoteObject _permission = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (mapsev) ","mapsev",8,mapsev.mostCurrent.activityBA,mapsev.mostCurrent,68);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 69;BA.debugLine="Log(\"MapsEV Loaded\")";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","24456449",RemoteObject.createImmutable("MapsEV Loaded"),0);
 BA.debugLineNum = 70;BA.debugLine="If Starter.GPS1.GPSEnabled = False Then";
Debug.ShouldStop(32);
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
 BA.debugLineNum = 71;BA.debugLine="ToastMessageShow(\"Please enable the GPS device.\"";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Please enable the GPS device.")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 72;BA.debugLine="StartActivity(Starter.GPS1.LocationSettingsInten";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",mapsev.processBA,(Object)((parent.mostCurrent._starter._gps1 /*RemoteObject*/ .runMethod(false,"getLocationSettingsIntent"))));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 74;BA.debugLine="Starter.rp.CheckAndRequest(Starter.rp.PERMISSION";
Debug.ShouldStop(512);
parent.mostCurrent._starter._rp /*RemoteObject*/ .runVoidMethod ("CheckAndRequest",mapsev.processBA,(Object)(parent.mostCurrent._starter._rp /*RemoteObject*/ .getField(true,"PERMISSION_ACCESS_FINE_LOCATION")));
 BA.debugLineNum = 75;BA.debugLine="Wait For Activity_PermissionResult (Permission A";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","activity_permissionresult", mapsev.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mapsev", "activity_resume"), null);
this.state = 13;
return;
case 13:
//C
this.state = 6;
_permission = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Permission", _permission);
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 76;BA.debugLine="If Result Then";
Debug.ShouldStop(2048);
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
 BA.debugLineNum = 77;BA.debugLine="CallSubDelayed(Starter, \"StartGPS\")";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("CallSubDelayed",mapsev.processBA,(Object)((parent.mostCurrent._starter.getObject())),(Object)(RemoteObject.createImmutable("StartGPS")));
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 79;BA.debugLine="ToastMessageShow(\"Please allow GPS to run this";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Please allow GPS to run this appliation")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 80;BA.debugLine="Activity.Finish";
Debug.ShouldStop(32768);
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
 BA.debugLineNum = 83;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("BtnBack_Click (mapsev) ","mapsev",8,mapsev.mostCurrent.activityBA,mapsev.mostCurrent,89);
if (RapidSub.canDelegate("btnback_click")) { return b4a.DesaWisataSumpu.mapsev.remoteMe.runUserSub(false, "mapsev","btnback_click");}
 BA.debugLineNum = 89;BA.debugLine="Private Sub BtnBack_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 90;BA.debugLine="Log(\"Going back to previous activity\")";
Debug.ShouldStop(33554432);
mapsev.mostCurrent.__c.runVoidMethod ("LogImpl","24587521",RemoteObject.createImmutable("Going back to previous activity"),0);
 BA.debugLineNum = 91;BA.debugLine="Starter.mapStatus = \"\"";
Debug.ShouldStop(67108864);
mapsev.mostCurrent._starter._mapstatus /*RemoteObject*/  = BA.ObjectToString("");
 BA.debugLineNum = 92;BA.debugLine="Activity.Finish";
Debug.ShouldStop(134217728);
mapsev.mostCurrent._activity.runVoidMethod ("Finish");
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
public static RemoteObject  _btnlist_click() throws Exception{
try {
		Debug.PushSubsStack("btnList_Click (mapsev) ","mapsev",8,mapsev.mostCurrent.activityBA,mapsev.mostCurrent,141);
if (RapidSub.canDelegate("btnlist_click")) { return b4a.DesaWisataSumpu.mapsev.remoteMe.runUserSub(false, "mapsev","btnlist_click");}
 BA.debugLineNum = 141;BA.debugLine="Private Sub btnList_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 142;BA.debugLine="Log(\"Redirect to ListEV activity\")";
Debug.ShouldStop(8192);
mapsev.mostCurrent.__c.runVoidMethod ("LogImpl","24980737",RemoteObject.createImmutable("Redirect to ListEV activity"),0);
 BA.debugLineNum = 143;BA.debugLine="StartActivity(ListEV)";
Debug.ShouldStop(16384);
mapsev.mostCurrent.__c.runVoidMethod ("StartActivity",mapsev.processBA,(Object)((mapsev.mostCurrent._listev.getObject())));
 BA.debugLineNum = 144;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("btnList2_Click (mapsev) ","mapsev",8,mapsev.mostCurrent.activityBA,mapsev.mostCurrent,146);
if (RapidSub.canDelegate("btnlist2_click")) { return b4a.DesaWisataSumpu.mapsev.remoteMe.runUserSub(false, "mapsev","btnlist2_click");}
 BA.debugLineNum = 146;BA.debugLine="Private Sub btnList2_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 147;BA.debugLine="Log(\"Redirect to ListEV activity\")";
Debug.ShouldStop(262144);
mapsev.mostCurrent.__c.runVoidMethod ("LogImpl","25046273",RemoteObject.createImmutable("Redirect to ListEV activity"),0);
 BA.debugLineNum = 148;BA.debugLine="StartActivity(ListEV)";
Debug.ShouldStop(524288);
mapsev.mostCurrent.__c.runVoidMethod ("StartActivity",mapsev.processBA,(Object)((mapsev.mostCurrent._listev.getObject())));
 BA.debugLineNum = 149;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("btnObj_Click (mapsev) ","mapsev",8,mapsev.mostCurrent.activityBA,mapsev.mostCurrent,124);
if (RapidSub.canDelegate("btnobj_click")) { return b4a.DesaWisataSumpu.mapsev.remoteMe.runUserSub(false, "mapsev","btnobj_click");}
RemoteObject _boundtoobject = RemoteObject.createImmutable("");
 BA.debugLineNum = 124;BA.debugLine="Private Sub btnObj_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 125;BA.debugLine="Log(\"Pan to Event\")";
Debug.ShouldStop(268435456);
mapsev.mostCurrent.__c.runVoidMethod ("LogImpl","24849665",RemoteObject.createImmutable("Pan to Event"),0);
 BA.debugLineNum = 126;BA.debugLine="Dim boundToObject As String";
Debug.ShouldStop(536870912);
_boundtoobject = RemoteObject.createImmutable("");Debug.locals.put("boundToObject", _boundtoobject);
 BA.debugLineNum = 127;BA.debugLine="If isFiltered Then";
Debug.ShouldStop(1073741824);
if (mapsev._isfiltered.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 128;BA.debugLine="boundToObject = \"findEV('')\"";
Debug.ShouldStop(-2147483648);
_boundtoobject = BA.ObjectToString("findEV('')");Debug.locals.put("boundToObject", _boundtoobject);
 BA.debugLineNum = 129;BA.debugLine="isFiltered = False";
Debug.ShouldStop(1);
mapsev._isfiltered = mapsev.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 130;BA.debugLine="edtSearchEV.Text = \"\"";
Debug.ShouldStop(2);
mapsev.mostCurrent._edtsearchev.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 }else {
 BA.debugLineNum = 132;BA.debugLine="boundToObject = \"boundToObject(false)\"";
Debug.ShouldStop(8);
_boundtoobject = BA.ObjectToString("boundToObject(false)");Debug.locals.put("boundToObject", _boundtoobject);
 };
 BA.debugLineNum = 134;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewEV, boun";
Debug.ShouldStop(32);
mapsev.mostCurrent._mywebviewextras.runVoidMethod ("executeJavascript",(Object)((mapsev.mostCurrent._webviewev.getObject())),(Object)(_boundtoobject));
 BA.debugLineNum = 135;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("btnUserLoc_Click (mapsev) ","mapsev",8,mapsev.mostCurrent.activityBA,mapsev.mostCurrent,117);
if (RapidSub.canDelegate("btnuserloc_click")) { return b4a.DesaWisataSumpu.mapsev.remoteMe.runUserSub(false, "mapsev","btnuserloc_click");}
RemoteObject _pantouser = RemoteObject.createImmutable("");
 BA.debugLineNum = 117;BA.debugLine="Private Sub btnUserLoc_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 118;BA.debugLine="Log(\"Panning to user location\")";
Debug.ShouldStop(2097152);
mapsev.mostCurrent.__c.runVoidMethod ("LogImpl","24784129",RemoteObject.createImmutable("Panning to user location"),0);
 BA.debugLineNum = 119;BA.debugLine="UpdateLocation";
Debug.ShouldStop(4194304);
_updatelocation();
 BA.debugLineNum = 120;BA.debugLine="Dim panToUser As String = \"panToUser()\"";
Debug.ShouldStop(8388608);
_pantouser = BA.ObjectToString("panToUser()");Debug.locals.put("panToUser", _pantouser);Debug.locals.put("panToUser", _pantouser);
 BA.debugLineNum = 121;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewEV, panT";
Debug.ShouldStop(16777216);
mapsev.mostCurrent._mywebviewextras.runVoidMethod ("executeJavascript",(Object)((mapsev.mostCurrent._webviewev.getObject())),(Object)(_pantouser));
 BA.debugLineNum = 122;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 19;BA.debugLine="Private MyWebViewExtras As WebViewExtras";
mapsev.mostCurrent._mywebviewextras = RemoteObject.createNew ("uk.co.martinpearman.b4a.webviewextras.WebViewExtras");
 //BA.debugLineNum = 20;BA.debugLine="Private MyWebViewSettings As WebViewSettings";
mapsev.mostCurrent._mywebviewsettings = RemoteObject.createNew ("uk.co.martinpearman.b4a.webviewsettings.WebViewSettings");
 //BA.debugLineNum = 21;BA.debugLine="Private PanelEV As Panel";
mapsev.mostCurrent._panelev = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private WebViewEV As WebView";
mapsev.mostCurrent._webviewev = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private BtnBack As Button";
mapsev.mostCurrent._btnback = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private Navbar As Panel";
mapsev.mostCurrent._navbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private MainScroll As ScrollView";
mapsev.mostCurrent._mainscroll = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private btnUserLoc As Button";
mapsev.mostCurrent._btnuserloc = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private btnObj As Button";
mapsev.mostCurrent._btnobj = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private edtSearchEV As EditText";
mapsev.mostCurrent._edtsearchev = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private btnList As Button";
mapsev.mostCurrent._btnlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private btnList2 As Button";
mapsev.mostCurrent._btnlist2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private DateTemplate As B4XDateTemplate";
mapsev.mostCurrent._datetemplate = RemoteObject.createNew ("b4a.DesaWisataSumpu.b4xdatetemplate");
 //BA.debugLineNum = 32;BA.debugLine="Private Dialog As B4XDialog";
mapsev.mostCurrent._dialog = RemoteObject.createNew ("b4a.DesaWisataSumpu.b4xdialog");
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Dim nameEV As String";
mapsev._nameev = RemoteObject.createImmutable("");
 //BA.debugLineNum = 10;BA.debugLine="Dim categoryMap As Map";
mapsev._categorymap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 11;BA.debugLine="Dim isFiltered As Boolean = False";
mapsev._isfiltered = mapsev.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 12;BA.debugLine="Private XUI As XUI";
mapsev._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _updatelocation() throws Exception{
try {
		Debug.PushSubsStack("UpdateLocation (mapsev) ","mapsev",8,mapsev.mostCurrent.activityBA,mapsev.mostCurrent,95);
if (RapidSub.canDelegate("updatelocation")) { return b4a.DesaWisataSumpu.mapsev.remoteMe.runUserSub(false, "mapsev","updatelocation");}
RemoteObject _userposition = RemoteObject.createImmutable("");
 BA.debugLineNum = 95;BA.debugLine="Public Sub UpdateLocation";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 96;BA.debugLine="Log(\"Update user position on Maps Event\")";
Debug.ShouldStop(-2147483648);
mapsev.mostCurrent.__c.runVoidMethod ("LogImpl","24653057",RemoteObject.createImmutable("Update user position on Maps Event"),0);
 BA.debugLineNum = 97;BA.debugLine="Log(\"Lat: \"&Starter.lat&\"; Long: \"&Starter.lng)";
Debug.ShouldStop(1);
mapsev.mostCurrent.__c.runVoidMethod ("LogImpl","24653058",RemoteObject.concat(RemoteObject.createImmutable("Lat: "),mapsev.mostCurrent._starter._lat /*RemoteObject*/ ,RemoteObject.createImmutable("; Long: "),mapsev.mostCurrent._starter._lng /*RemoteObject*/ ),0);
 BA.debugLineNum = 98;BA.debugLine="Dim userPosition As String";
Debug.ShouldStop(2);
_userposition = RemoteObject.createImmutable("");Debug.locals.put("userPosition", _userposition);
 BA.debugLineNum = 99;BA.debugLine="userPosition = \"userPositionAPI(\"&Starter.lat&\",";
Debug.ShouldStop(4);
_userposition = RemoteObject.concat(RemoteObject.createImmutable("userPositionAPI("),mapsev.mostCurrent._starter._lat /*RemoteObject*/ ,RemoteObject.createImmutable(", "),mapsev.mostCurrent._starter._lng /*RemoteObject*/ ,RemoteObject.createImmutable(")"));Debug.locals.put("userPosition", _userposition);
 BA.debugLineNum = 100;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewEV, user";
Debug.ShouldStop(8);
mapsev.mostCurrent._mywebviewextras.runVoidMethod ("executeJavascript",(Object)((mapsev.mostCurrent._webviewev.getObject())),(Object)(_userposition));
 BA.debugLineNum = 101;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _webviewev_pagefinished(RemoteObject _url) throws Exception{
try {
		Debug.PushSubsStack("WebViewEV_PageFinished (mapsev) ","mapsev",8,mapsev.mostCurrent.activityBA,mapsev.mostCurrent,137);
if (RapidSub.canDelegate("webviewev_pagefinished")) { return b4a.DesaWisataSumpu.mapsev.remoteMe.runUserSub(false, "mapsev","webviewev_pagefinished", _url);}
Debug.locals.put("Url", _url);
 BA.debugLineNum = 137;BA.debugLine="Private Sub WebViewEV_PageFinished (Url As String)";
Debug.ShouldStop(256);
 BA.debugLineNum = 139;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _webviewev_progresschanged(RemoteObject _loading) throws Exception{
try {
		Debug.PushSubsStack("WebViewEV_ProgressChanged (mapsev) ","mapsev",8,mapsev.mostCurrent.activityBA,mapsev.mostCurrent,103);
if (RapidSub.canDelegate("webviewev_progresschanged")) { return b4a.DesaWisataSumpu.mapsev.remoteMe.runUserSub(false, "mapsev","webviewev_progresschanged", _loading);}
Debug.locals.put("loading", _loading);
 BA.debugLineNum = 103;BA.debugLine="Sub WebViewEV_ProgressChanged(loading As Int)";
Debug.ShouldStop(64);
 BA.debugLineNum = 104;BA.debugLine="If loading == 100 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_loading,BA.numberCast(double.class, 100))) { 
 BA.debugLineNum = 105;BA.debugLine="Log(\"Webview loaded\")";
Debug.ShouldStop(256);
mapsev.mostCurrent.__c.runVoidMethod ("LogImpl","24718594",RemoteObject.createImmutable("Webview loaded"),0);
 BA.debugLineNum = 106;BA.debugLine="Starter.webviewLoading = loading";
Debug.ShouldStop(512);
mapsev.mostCurrent._starter._webviewloading /*RemoteObject*/  = _loading;
 BA.debugLineNum = 107;BA.debugLine="btnObj.Visible = True";
Debug.ShouldStop(1024);
mapsev.mostCurrent._btnobj.runMethod(true,"setVisible",mapsev.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 108;BA.debugLine="btnUserLoc.Visible = True";
Debug.ShouldStop(2048);
mapsev.mostCurrent._btnuserloc.runMethod(true,"setVisible",mapsev.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 109;BA.debugLine="btnList.Visible = True";
Debug.ShouldStop(4096);
mapsev.mostCurrent._btnlist.runMethod(true,"setVisible",mapsev.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 110;BA.debugLine="btnList2.Visible = True";
Debug.ShouldStop(8192);
mapsev.mostCurrent._btnlist2.runMethod(true,"setVisible",mapsev.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 111;BA.debugLine="UpdateLocation";
Debug.ShouldStop(16384);
_updatelocation();
 }else {
 BA.debugLineNum = 113;BA.debugLine="Log(\"Webview loading at \"&loading&\"% ....\")";
Debug.ShouldStop(65536);
mapsev.mostCurrent.__c.runVoidMethod ("LogImpl","24718602",RemoteObject.concat(RemoteObject.createImmutable("Webview loading at "),_loading,RemoteObject.createImmutable("% ....")),0);
 };
 BA.debugLineNum = 115;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}