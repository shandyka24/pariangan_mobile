package b4a.DesaWisataSumpu;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,40);
if (RapidSub.canDelegate("activity_create")) { return b4a.DesaWisataSumpu.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 40;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(128);
 BA.debugLineNum = 42;BA.debugLine="If manager.GetBoolean(\"is_login\") Then";
Debug.ShouldStop(512);
if (main._manager.runMethod(true,"GetBoolean",(Object)(RemoteObject.createImmutable("is_login"))).<Boolean>get().booleanValue()) { 
 }else {
 BA.debugLineNum = 44;BA.debugLine="manager.SetBoolean(\"visitor\", True)";
Debug.ShouldStop(2048);
main._manager.runVoidMethod ("SetBoolean",(Object)(BA.ObjectToString("visitor")),(Object)(main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 45;BA.debugLine="manager.SetBoolean(\"user\", False)";
Debug.ShouldStop(4096);
main._manager.runVoidMethod ("SetBoolean",(Object)(BA.ObjectToString("user")),(Object)(main.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 46;BA.debugLine="Activity.Finish";
Debug.ShouldStop(8192);
main.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 47;BA.debugLine="StartActivity(HomeVisitor)";
Debug.ShouldStop(16384);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((main.mostCurrent._homevisitor.getObject())));
 };
 BA.debugLineNum = 50;BA.debugLine="CheckLogin";
Debug.ShouldStop(131072);
_checklogin();
 BA.debugLineNum = 51;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
Debug.ShouldStop(262144);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MainScrollView")),main.mostCurrent.activityBA);
 BA.debugLineNum = 52;BA.debugLine="MainScroll.Panel.LoadLayout(\"Login\")";
Debug.ShouldStop(524288);
main.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Login")),main.mostCurrent.activityBA);
 BA.debugLineNum = 53;BA.debugLine="Navbar.Visible = False";
Debug.ShouldStop(1048576);
main.mostCurrent._navbar.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 55;BA.debugLine="If Navbar.Visible == False Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",main.mostCurrent._navbar.runMethod(true,"getVisible"),main.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 56;BA.debugLine="MainScroll.Top = MainScroll.Top - Navbar.Height";
Debug.ShouldStop(8388608);
main.mostCurrent._mainscroll.runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {main.mostCurrent._mainscroll.runMethod(true,"getTop"),main.mostCurrent._navbar.runMethod(true,"getHeight")}, "-",1, 1));
 BA.debugLineNum = 57;BA.debugLine="MainScroll.Height = MainScroll.Height + Navbar.H";
Debug.ShouldStop(16777216);
main.mostCurrent._mainscroll.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {main.mostCurrent._mainscroll.runMethod(true,"getHeight"),main.mostCurrent._navbar.runMethod(true,"getHeight")}, "+",1, 1));
 };
 BA.debugLineNum = 60;BA.debugLine="PanelLogin.Height = MainScroll.Height";
Debug.ShouldStop(134217728);
main.mostCurrent._panellogin.runMethod(true,"setHeight",main.mostCurrent._mainscroll.runMethod(true,"getHeight"));
 BA.debugLineNum = 61;BA.debugLine="MainScroll.Panel.Height = MainScroll.Height";
Debug.ShouldStop(268435456);
main.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethod(true,"setHeight",main.mostCurrent._mainscroll.runMethod(true,"getHeight"));
 BA.debugLineNum = 63;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,70);
if (RapidSub.canDelegate("activity_pause")) { return b4a.DesaWisataSumpu.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 70;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(32);
 BA.debugLineNum = 72;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,65);
if (RapidSub.canDelegate("activity_resume")) { return b4a.DesaWisataSumpu.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 65;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(1);
 BA.debugLineNum = 66;BA.debugLine="Log(\"Login loaded\")";
Debug.ShouldStop(2);
main.mostCurrent.__c.runVoidMethod ("LogImpl","2196609",RemoteObject.createImmutable("Login loaded"),0);
 BA.debugLineNum = 67;BA.debugLine="Log(\"Resume: \"&manager.GetBoolean(\"Hanafi\"))";
Debug.ShouldStop(4);
main.mostCurrent.__c.runVoidMethod ("LogImpl","2196610",RemoteObject.concat(RemoteObject.createImmutable("Resume: "),main._manager.runMethod(true,"GetBoolean",(Object)(RemoteObject.createImmutable("Hanafi")))),0);
 BA.debugLineNum = 68;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnlogin_click() throws Exception{
try {
		Debug.PushSubsStack("BtnLogin_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,84);
if (RapidSub.canDelegate("btnlogin_click")) { return b4a.DesaWisataSumpu.main.remoteMe.runUserSub(false, "main","btnlogin_click");}
 BA.debugLineNum = 84;BA.debugLine="Private Sub BtnLogin_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 85;BA.debugLine="Core.ExecuteUrl(API&\"login\", \"login=\"&EditLogin.T";
Debug.ShouldStop(1048576);
main.mostCurrent._core.runVoidMethod ("_executeurl" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.concat(main._api,RemoteObject.createImmutable("login"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("login="),main.mostCurrent._editlogin.runMethod(true,"getText"),RemoteObject.createImmutable("&password="),main.mostCurrent._editpassword.runMethod(true,"getText"))),(Object)(BA.ObjectToString("Login")),(Object)(main.getObject()));
 BA.debugLineNum = 86;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnvisitor_click() throws Exception{
try {
		Debug.PushSubsStack("BtnVisitor_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,75);
if (RapidSub.canDelegate("btnvisitor_click")) { return b4a.DesaWisataSumpu.main.remoteMe.runUserSub(false, "main","btnvisitor_click");}
 BA.debugLineNum = 75;BA.debugLine="Private Sub BtnVisitor_Click";
Debug.ShouldStop(1024);
 BA.debugLineNum = 76;BA.debugLine="Log(\"Redirecting to HomeVisitor Activity\")";
Debug.ShouldStop(2048);
main.mostCurrent.__c.runVoidMethod ("LogImpl","2327681",RemoteObject.createImmutable("Redirecting to HomeVisitor Activity"),0);
 BA.debugLineNum = 77;BA.debugLine="manager.SetBoolean(\"is_login\", False)";
Debug.ShouldStop(4096);
main._manager.runVoidMethod ("SetBoolean",(Object)(BA.ObjectToString("is_login")),(Object)(main.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 78;BA.debugLine="manager.SetBoolean(\"visitor\", True)";
Debug.ShouldStop(8192);
main._manager.runVoidMethod ("SetBoolean",(Object)(BA.ObjectToString("visitor")),(Object)(main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 79;BA.debugLine="manager.SetBoolean(\"user\", False)";
Debug.ShouldStop(16384);
main._manager.runVoidMethod ("SetBoolean",(Object)(BA.ObjectToString("user")),(Object)(main.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 80;BA.debugLine="Activity.Finish";
Debug.ShouldStop(32768);
main.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 81;BA.debugLine="StartActivity(HomeVisitor)";
Debug.ShouldStop(65536);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((main.mostCurrent._homevisitor.getObject())));
 BA.debugLineNum = 82;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checklogin() throws Exception{
try {
		Debug.PushSubsStack("CheckLogin (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,88);
if (RapidSub.canDelegate("checklogin")) { return b4a.DesaWisataSumpu.main.remoteMe.runUserSub(false, "main","checklogin");}
RemoteObject _islogin = RemoteObject.createImmutable(false);
 BA.debugLineNum = 88;BA.debugLine="Sub CheckLogin";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 89;BA.debugLine="Log(\"Checking login status...\")";
Debug.ShouldStop(16777216);
main.mostCurrent.__c.runVoidMethod ("LogImpl","2458753",RemoteObject.createImmutable("Checking login status..."),0);
 BA.debugLineNum = 90;BA.debugLine="Dim isLogin As Boolean";
Debug.ShouldStop(33554432);
_islogin = RemoteObject.createImmutable(false);Debug.locals.put("isLogin", _islogin);
 BA.debugLineNum = 91;BA.debugLine="isLogin = manager.GetBoolean(\"is_login\")";
Debug.ShouldStop(67108864);
_islogin = main._manager.runMethod(true,"GetBoolean",(Object)(RemoteObject.createImmutable("is_login")));Debug.locals.put("isLogin", _islogin);
 BA.debugLineNum = 92;BA.debugLine="If isLogin Then";
Debug.ShouldStop(134217728);
if (_islogin.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 93;BA.debugLine="If manager.GetBoolean(\"user\") Then";
Debug.ShouldStop(268435456);
if (main._manager.runMethod(true,"GetBoolean",(Object)(RemoteObject.createImmutable("user"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 94;BA.debugLine="Log(\"Redirecting to HomeUser activity\")";
Debug.ShouldStop(536870912);
main.mostCurrent.__c.runVoidMethod ("LogImpl","2458758",RemoteObject.createImmutable("Redirecting to HomeUser activity"),0);
 BA.debugLineNum = 95;BA.debugLine="Activity.Finish";
Debug.ShouldStop(1073741824);
main.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 96;BA.debugLine="StartActivity(HomeUser)";
Debug.ShouldStop(-2147483648);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((main.mostCurrent._homeuser.getObject())));
 };
 };
 BA.debugLineNum = 99;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 30;BA.debugLine="Private MainScroll As ScrollView";
main.mostCurrent._mainscroll = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private Navbar As Panel";
main.mostCurrent._navbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private BtnLogin As Button";
main.mostCurrent._btnlogin = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private BtnVisitor As Button";
main.mostCurrent._btnvisitor = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private EditLogin As EditText";
main.mostCurrent._editlogin = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private EditPassword As EditText";
main.mostCurrent._editpassword = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Private ImageLogin As ImageView";
main.mostCurrent._imagelogin = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Private PanelLogin As Panel";
main.mostCurrent._panellogin = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,101);
if (RapidSub.canDelegate("jobdone")) { return b4a.DesaWisataSumpu.main.remoteMe.runUserSub(false, "main","jobdone", _job);}
RemoteObject _res = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _errorparser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _errormap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _error = RemoteObject.createImmutable("");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 101;BA.debugLine="Sub JobDone (Job As HttpJob)";
Debug.ShouldStop(16);
 BA.debugLineNum = 102;BA.debugLine="Log(\"JobName = \" & Job.JobName & \", Success = \" &";
Debug.ShouldStop(32);
main.mostCurrent.__c.runVoidMethod ("LogImpl","2524289",RemoteObject.concat(RemoteObject.createImmutable("JobName = "),_job.getField(true,"_jobname" /*RemoteObject*/ ),RemoteObject.createImmutable(", Success = "),_job.getField(true,"_success" /*RemoteObject*/ )),0);
 BA.debugLineNum = 103;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(64);
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 104;BA.debugLine="Try";
Debug.ShouldStop(128);
try { BA.debugLineNum = 105;BA.debugLine="Dim res As String";
Debug.ShouldStop(256);
_res = RemoteObject.createImmutable("");Debug.locals.put("res", _res);
 BA.debugLineNum = 106;BA.debugLine="res = Job.GetString";
Debug.ShouldStop(512);
_res = _job.runClassMethod (b4a.DesaWisataSumpu.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("res", _res);
 BA.debugLineNum = 107;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(1024);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 108;BA.debugLine="parser.Initialize(res)";
Debug.ShouldStop(2048);
_parser.runVoidMethod ("Initialize",(Object)(_res));
 BA.debugLineNum = 109;BA.debugLine="Log(\"Response from server :\"&res)";
Debug.ShouldStop(4096);
main.mostCurrent.__c.runVoidMethod ("LogImpl","2524296",RemoteObject.concat(RemoteObject.createImmutable("Response from server :"),_res),0);
 BA.debugLineNum = 111;BA.debugLine="Dim map As Map";
Debug.ShouldStop(16384);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("map", _map);
 BA.debugLineNum = 112;BA.debugLine="map = parser.NextObject";
Debug.ShouldStop(32768);
_map = _parser.runMethod(false,"NextObject");Debug.locals.put("map", _map);
 BA.debugLineNum = 113;BA.debugLine="data = map.Get(\"data\")";
Debug.ShouldStop(65536);
main._data = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("data")))));
 BA.debugLineNum = 114;BA.debugLine="in_group = data.Get(\"in_group\")";
Debug.ShouldStop(131072);
main._in_group = BA.ObjectToBoolean(main._data.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("in_group")))));
 BA.debugLineNum = 115;BA.debugLine="If in_group Then";
Debug.ShouldStop(262144);
if (main._in_group.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 116;BA.debugLine="user = data.Get(\"user\")";
Debug.ShouldStop(524288);
main._user = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), main._data.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("user")))));
 BA.debugLineNum = 117;BA.debugLine="id = user.Get(\"id\")";
Debug.ShouldStop(1048576);
main._id = BA.ObjectToString(main._user.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));
 BA.debugLineNum = 118;BA.debugLine="email = user.Get(\"email\")";
Debug.ShouldStop(2097152);
main._email = BA.ObjectToString(main._user.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("email")))));
 BA.debugLineNum = 119;BA.debugLine="username = user.Get(\"username\")";
Debug.ShouldStop(4194304);
main._username = BA.ObjectToString(main._user.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("username")))));
 BA.debugLineNum = 120;BA.debugLine="first_name = user.Get(\"first_name\")";
Debug.ShouldStop(8388608);
main._first_name = BA.ObjectToString(main._user.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("first_name")))));
 BA.debugLineNum = 121;BA.debugLine="last_name = user.Get(\"last_name\")";
Debug.ShouldStop(16777216);
main._last_name = BA.ObjectToString(main._user.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("last_name")))));
 BA.debugLineNum = 122;BA.debugLine="avatar = user.Get(\"avatar\")";
Debug.ShouldStop(33554432);
main._avatar = BA.ObjectToString(main._user.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("avatar")))));
 BA.debugLineNum = 123;BA.debugLine="address = user.Get(\"address\")";
Debug.ShouldStop(67108864);
main._address = BA.ObjectToString(main._user.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("address")))));
 BA.debugLineNum = 124;BA.debugLine="phone = user.Get(\"phone\")";
Debug.ShouldStop(134217728);
main._phone = BA.ObjectToString(main._user.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("phone")))));
 BA.debugLineNum = 126;BA.debugLine="ToastMessageShow(\"Login as User\", False)";
Debug.ShouldStop(536870912);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Login as User")),(Object)(main.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 127;BA.debugLine="Msgbox(\"Hi, \"&first_name&\" \"&last_name, \"Logge";
Debug.ShouldStop(1073741824);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Hi, "),main._first_name,RemoteObject.createImmutable(" "),main._last_name))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Logged In"))),main.mostCurrent.activityBA);
 BA.debugLineNum = 128;BA.debugLine="Log(\"Redirect to HomeUser Activity\")";
Debug.ShouldStop(-2147483648);
main.mostCurrent.__c.runVoidMethod ("LogImpl","2524315",RemoteObject.createImmutable("Redirect to HomeUser Activity"),0);
 BA.debugLineNum = 130;BA.debugLine="manager.SetBoolean(\"is_login\", True)";
Debug.ShouldStop(2);
main._manager.runVoidMethod ("SetBoolean",(Object)(BA.ObjectToString("is_login")),(Object)(main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 131;BA.debugLine="manager.SetBoolean(\"user\", True)";
Debug.ShouldStop(4);
main._manager.runVoidMethod ("SetBoolean",(Object)(BA.ObjectToString("user")),(Object)(main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 132;BA.debugLine="manager.SetBoolean(\"visitor\", False)";
Debug.ShouldStop(8);
main._manager.runVoidMethod ("SetBoolean",(Object)(BA.ObjectToString("visitor")),(Object)(main.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 133;BA.debugLine="manager.SetString(\"user_id\", id)";
Debug.ShouldStop(16);
main._manager.runVoidMethod ("SetString",(Object)(BA.ObjectToString("user_id")),(Object)(main._id));
 BA.debugLineNum = 134;BA.debugLine="Activity.Finish";
Debug.ShouldStop(32);
main.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 135;BA.debugLine="StartActivity(HomeUser)";
Debug.ShouldStop(64);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((main.mostCurrent._homeuser.getObject())));
 }else {
 BA.debugLineNum = 137;BA.debugLine="Msgbox(\"Please input correct credentials\", \"Lo";
Debug.ShouldStop(256);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Please input correct credentials")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Login Failed"))),main.mostCurrent.activityBA);
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e36) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e36.toString()); BA.debugLineNum = 140;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2048);
main.mostCurrent.__c.runVoidMethod ("LogImpl","2524327",BA.ObjectToString(main.mostCurrent.__c.runMethod(false,"LastException",main.mostCurrent.activityBA)),0);
 };
 }else {
 BA.debugLineNum = 143;BA.debugLine="Dim errorParser As JSONParser";
Debug.ShouldStop(16384);
_errorparser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("errorParser", _errorparser);
 BA.debugLineNum = 144;BA.debugLine="errorParser.Initialize(Job.ErrorMessage)";
Debug.ShouldStop(32768);
_errorparser.runVoidMethod ("Initialize",(Object)(_job.getField(true,"_errormessage" /*RemoteObject*/ )));
 BA.debugLineNum = 146;BA.debugLine="Dim errorMap As Map";
Debug.ShouldStop(131072);
_errormap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("errorMap", _errormap);
 BA.debugLineNum = 147;BA.debugLine="errorMap = errorParser.NextObject";
Debug.ShouldStop(262144);
_errormap = _errorparser.runMethod(false,"NextObject");Debug.locals.put("errorMap", _errormap);
 BA.debugLineNum = 148;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
Debug.ShouldStop(524288);
main.mostCurrent.__c.runVoidMethod ("LogImpl","2524335",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_job.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 BA.debugLineNum = 150;BA.debugLine="Dim error As String";
Debug.ShouldStop(2097152);
_error = RemoteObject.createImmutable("");Debug.locals.put("error", _error);
 BA.debugLineNum = 151;BA.debugLine="error = errorMap.Get(\"message\")";
Debug.ShouldStop(4194304);
_error = BA.ObjectToString(_errormap.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("message")))));Debug.locals.put("error", _error);
 BA.debugLineNum = 152;BA.debugLine="ToastMessageShow(\"Error: \" & error, True)";
Debug.ShouldStop(8388608);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Error: "),_error))),(Object)(main.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 154;BA.debugLine="Job.Release";
Debug.ShouldStop(33554432);
_job.runClassMethod (b4a.DesaWisataSumpu.httpjob.class, "_release" /*RemoteObject*/ );
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

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
core_subs_0._process_globals();
detailev_subs_0._process_globals();
detailrg_subs_0._process_globals();
homeuser_subs_0._process_globals();
homevisitor_subs_0._process_globals();
listev_subs_0._process_globals();
listrg_subs_0._process_globals();
mapsev_subs_0._process_globals();
mapsrg_subs_0._process_globals();
starter_subs_0._process_globals();
httputils2service_subs_0._process_globals();
b4xcollections_subs_0._process_globals();
xuiviewsutils_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.DesaWisataSumpu.main");
core.myClass = BA.getDeviceClass ("b4a.DesaWisataSumpu.core");
detailev.myClass = BA.getDeviceClass ("b4a.DesaWisataSumpu.detailev");
detailrg.myClass = BA.getDeviceClass ("b4a.DesaWisataSumpu.detailrg");
homeuser.myClass = BA.getDeviceClass ("b4a.DesaWisataSumpu.homeuser");
homevisitor.myClass = BA.getDeviceClass ("b4a.DesaWisataSumpu.homevisitor");
listev.myClass = BA.getDeviceClass ("b4a.DesaWisataSumpu.listev");
listrg.myClass = BA.getDeviceClass ("b4a.DesaWisataSumpu.listrg");
mapsev.myClass = BA.getDeviceClass ("b4a.DesaWisataSumpu.mapsev");
mapsrg.myClass = BA.getDeviceClass ("b4a.DesaWisataSumpu.mapsrg");
starter.myClass = BA.getDeviceClass ("b4a.DesaWisataSumpu.starter");
httputils2service.myClass = BA.getDeviceClass ("b4a.DesaWisataSumpu.httputils2service");
httpjob.myClass = BA.getDeviceClass ("b4a.DesaWisataSumpu.httpjob");
simplemediamanager.myClass = BA.getDeviceClass ("b4a.DesaWisataSumpu.simplemediamanager");
smmviews.myClass = BA.getDeviceClass ("b4a.DesaWisataSumpu.smmviews");
requestsmanager.myClass = BA.getDeviceClass ("b4a.DesaWisataSumpu.requestsmanager");
bitmapsasync.myClass = BA.getDeviceClass ("b4a.DesaWisataSumpu.bitmapsasync");
b4xbitset.myClass = BA.getDeviceClass ("b4a.DesaWisataSumpu.b4xbitset");
b4xbytesbuilder.myClass = BA.getDeviceClass ("b4a.DesaWisataSumpu.b4xbytesbuilder");
b4xcache.myClass = BA.getDeviceClass ("b4a.DesaWisataSumpu.b4xcache");
b4xcollections.myClass = BA.getDeviceClass ("b4a.DesaWisataSumpu.b4xcollections");
b4xcomparatorsort.myClass = BA.getDeviceClass ("b4a.DesaWisataSumpu.b4xcomparatorsort");
b4xorderedmap.myClass = BA.getDeviceClass ("b4a.DesaWisataSumpu.b4xorderedmap");
b4xset.myClass = BA.getDeviceClass ("b4a.DesaWisataSumpu.b4xset");
animatedcounter.myClass = BA.getDeviceClass ("b4a.DesaWisataSumpu.animatedcounter");
anotherprogressbar.myClass = BA.getDeviceClass ("b4a.DesaWisataSumpu.anotherprogressbar");
b4xbreadcrumb.myClass = BA.getDeviceClass ("b4a.DesaWisataSumpu.b4xbreadcrumb");
b4xcolortemplate.myClass = BA.getDeviceClass ("b4a.DesaWisataSumpu.b4xcolortemplate");
b4xcombobox.myClass = BA.getDeviceClass ("b4a.DesaWisataSumpu.b4xcombobox");
b4xdatetemplate.myClass = BA.getDeviceClass ("b4a.DesaWisataSumpu.b4xdatetemplate");
b4xdialog.myClass = BA.getDeviceClass ("b4a.DesaWisataSumpu.b4xdialog");
b4xfloattextfield.myClass = BA.getDeviceClass ("b4a.DesaWisataSumpu.b4xfloattextfield");
b4ximageview.myClass = BA.getDeviceClass ("b4a.DesaWisataSumpu.b4ximageview");
b4xinputtemplate.myClass = BA.getDeviceClass ("b4a.DesaWisataSumpu.b4xinputtemplate");
b4xlisttemplate.myClass = BA.getDeviceClass ("b4a.DesaWisataSumpu.b4xlisttemplate");
b4xloadingindicator.myClass = BA.getDeviceClass ("b4a.DesaWisataSumpu.b4xloadingindicator");
b4xlongtexttemplate.myClass = BA.getDeviceClass ("b4a.DesaWisataSumpu.b4xlongtexttemplate");
b4xplusminus.myClass = BA.getDeviceClass ("b4a.DesaWisataSumpu.b4xplusminus");
b4xradiobutton.myClass = BA.getDeviceClass ("b4a.DesaWisataSumpu.b4xradiobutton");
b4xsearchtemplate.myClass = BA.getDeviceClass ("b4a.DesaWisataSumpu.b4xsearchtemplate");
b4xseekbar.myClass = BA.getDeviceClass ("b4a.DesaWisataSumpu.b4xseekbar");
b4xsignaturetemplate.myClass = BA.getDeviceClass ("b4a.DesaWisataSumpu.b4xsignaturetemplate");
b4xswitch.myClass = BA.getDeviceClass ("b4a.DesaWisataSumpu.b4xswitch");
b4xtimedtemplate.myClass = BA.getDeviceClass ("b4a.DesaWisataSumpu.b4xtimedtemplate");
madewithlove.myClass = BA.getDeviceClass ("b4a.DesaWisataSumpu.madewithlove");
b4xformatter.myClass = BA.getDeviceClass ("b4a.DesaWisataSumpu.b4xformatter");
roundslider.myClass = BA.getDeviceClass ("b4a.DesaWisataSumpu.roundslider");
scrollinglabel.myClass = BA.getDeviceClass ("b4a.DesaWisataSumpu.scrollinglabel");
swiftbutton.myClass = BA.getDeviceClass ("b4a.DesaWisataSumpu.swiftbutton");
xuiviewsutils.myClass = BA.getDeviceClass ("b4a.DesaWisataSumpu.xuiviewsutils");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 18;BA.debugLine="Public server As String = \"https://b397-2404-c0-9";
main._server = BA.ObjectToString("https://b397-2404-c0-9810-00-2897-5f5c.ngrok-free.app/");
 //BA.debugLineNum = 20;BA.debugLine="Public API As String = server&\"api/\"";
main._api = RemoteObject.concat(main._server,RemoteObject.createImmutable("api/"));
 //BA.debugLineNum = 21;BA.debugLine="Public data, user As Map";
main._data = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
main._user = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 22;BA.debugLine="Public id, username, email, first_name, last_name";
main._id = RemoteObject.createImmutable("");
main._username = RemoteObject.createImmutable("");
main._email = RemoteObject.createImmutable("");
main._first_name = RemoteObject.createImmutable("");
main._last_name = RemoteObject.createImmutable("");
main._avatar = RemoteObject.createImmutable("");
main._address = RemoteObject.createImmutable("");
main._phone = RemoteObject.createImmutable("");
 //BA.debugLineNum = 23;BA.debugLine="Public in_group As Boolean";
main._in_group = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 24;BA.debugLine="Public manager As AHPreferenceManager";
main._manager = RemoteObject.createNew ("de.amberhome.objects.preferenceactivity.PreferenceManager");
 //BA.debugLineNum = 25;BA.debugLine="Private xui As XUI";
main._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}