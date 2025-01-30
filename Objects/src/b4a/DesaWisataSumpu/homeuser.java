package b4a.DesaWisataSumpu;


import anywheresoftware.b4a.B4AMenuItem;
import android.app.Activity;
import android.os.Bundle;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.B4AActivity;
import anywheresoftware.b4a.ObjectWrapper;
import anywheresoftware.b4a.objects.ActivityWrapper;
import java.lang.reflect.InvocationTargetException;
import anywheresoftware.b4a.B4AUncaughtException;
import anywheresoftware.b4a.debug.*;
import java.lang.ref.WeakReference;

public class homeuser extends Activity implements B4AActivity{
	public static homeuser mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = false;
	public static final boolean includeTitle = false;
    public static WeakReference<Activity> previousOne;
    public static boolean dontPause;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        mostCurrent = this;
		if (processBA == null) {
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.DesaWisataSumpu", "b4a.DesaWisataSumpu.homeuser");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (homeuser).");
				p.finish();
			}
		}
        processBA.setActivityPaused(true);
        processBA.runHook("oncreate", this, null);
		if (!includeTitle) {
        	this.getWindow().requestFeature(android.view.Window.FEATURE_NO_TITLE);
        }
        if (fullScreen) {
        	getWindow().setFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN,   
        			android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
		
        processBA.sharedProcessBA.activityBA = null;
		layout = new BALayout(this);
		setContentView(layout);
		afterFirstLayout = false;
        WaitForLayout wl = new WaitForLayout();
        if (anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startFromActivity(this, processBA, wl, false))
		    BA.handler.postDelayed(wl, 5);

	}
	static class WaitForLayout implements Runnable {
		public void run() {
			if (afterFirstLayout)
				return;
			if (mostCurrent == null)
				return;
            
			if (mostCurrent.layout.getWidth() == 0) {
				BA.handler.postDelayed(this, 5);
				return;
			}
			mostCurrent.layout.getLayoutParams().height = mostCurrent.layout.getHeight();
			mostCurrent.layout.getLayoutParams().width = mostCurrent.layout.getWidth();
			afterFirstLayout = true;
			mostCurrent.afterFirstLayout();
		}
	}
	private void afterFirstLayout() {
        if (this != mostCurrent)
			return;
		activityBA = new BA(this, layout, processBA, "b4a.DesaWisataSumpu", "b4a.DesaWisataSumpu.homeuser");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.DesaWisataSumpu.homeuser", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (homeuser) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (homeuser) Resume **");
        processBA.raiseEvent(null, "activity_resume");
        if (android.os.Build.VERSION.SDK_INT >= 11) {
			try {
				android.app.Activity.class.getMethod("invalidateOptionsMenu").invoke(this,(Object[]) null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	public void addMenuItem(B4AMenuItem item) {
		if (menuItems == null)
			menuItems = new java.util.ArrayList<B4AMenuItem>();
		menuItems.add(item);
	}
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		super.onCreateOptionsMenu(menu);
        try {
            if (processBA.subExists("activity_actionbarhomeclick")) {
                Class.forName("android.app.ActionBar").getMethod("setHomeButtonEnabled", boolean.class).invoke(
                    getClass().getMethod("getActionBar").invoke(this), true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (processBA.runHook("oncreateoptionsmenu", this, new Object[] {menu}))
            return true;
		if (menuItems == null)
			return false;
		for (B4AMenuItem bmi : menuItems) {
			android.view.MenuItem mi = menu.add(bmi.title);
			if (bmi.drawable != null)
				mi.setIcon(bmi.drawable);
            if (android.os.Build.VERSION.SDK_INT >= 11) {
				try {
                    if (bmi.addToBar) {
				        android.view.MenuItem.class.getMethod("setShowAsAction", int.class).invoke(mi, 1);
                    }
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			mi.setOnMenuItemClickListener(new B4AMenuItemsClickListener(bmi.eventName.toLowerCase(BA.cul)));
		}
        
		return true;
	}   
 @Override
 public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (item.getItemId() == 16908332) {
        processBA.raiseEvent(null, "activity_actionbarhomeclick");
        return true;
    }
    else
        return super.onOptionsItemSelected(item); 
}
@Override
 public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    super.onPrepareOptionsMenu(menu);
    processBA.runHook("onprepareoptionsmenu", this, new Object[] {menu});
    return true;
    
 }
 protected void onStart() {
    super.onStart();
    processBA.runHook("onstart", this, null);
}
 protected void onStop() {
    super.onStop();
    processBA.runHook("onstop", this, null);
}
    public void onWindowFocusChanged(boolean hasFocus) {
       super.onWindowFocusChanged(hasFocus);
       if (processBA.subExists("activity_windowfocuschanged"))
           processBA.raiseEvent2(null, true, "activity_windowfocuschanged", false, hasFocus);
    }
	private class B4AMenuItemsClickListener implements android.view.MenuItem.OnMenuItemClickListener {
		private final String eventName;
		public B4AMenuItemsClickListener(String eventName) {
			this.eventName = eventName;
		}
		public boolean onMenuItemClick(android.view.MenuItem item) {
			processBA.raiseEventFromUI(item.getTitle(), eventName + "_click");
			return true;
		}
	}
    public static Class<?> getObject() {
		return homeuser.class;
	}
    private Boolean onKeySubExist = null;
    private Boolean onKeyUpSubExist = null;
	@Override
	public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeydown", this, new Object[] {keyCode, event}))
            return true;
		if (onKeySubExist == null)
			onKeySubExist = processBA.subExists("activity_keypress");
		if (onKeySubExist) {
			if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK &&
					android.os.Build.VERSION.SDK_INT >= 18) {
				HandleKeyDelayed hk = new HandleKeyDelayed();
				hk.kc = keyCode;
				BA.handler.post(hk);
				return true;
			}
			else {
				boolean res = new HandleKeyDelayed().runDirectly(keyCode);
				if (res)
					return true;
			}
		}
		return super.onKeyDown(keyCode, event);
	}
	private class HandleKeyDelayed implements Runnable {
		int kc;
		public void run() {
			runDirectly(kc);
		}
		public boolean runDirectly(int keyCode) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keypress", false, keyCode);
			if (res == null || res == true) {
                return true;
            }
            else if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK) {
				finish();
				return true;
			}
            return false;
		}
		
	}
    @Override
	public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeyup", this, new Object[] {keyCode, event}))
            return true;
		if (onKeyUpSubExist == null)
			onKeyUpSubExist = processBA.subExists("activity_keyup");
		if (onKeyUpSubExist) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keyup", false, keyCode);
			if (res == null || res == true)
				return true;
		}
		return super.onKeyUp(keyCode, event);
	}
	@Override
	public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
		this.setIntent(intent);
        processBA.runHook("onnewintent", this, new Object[] {intent});
	}
    @Override 
	public void onPause() {
		super.onPause();
        if (_activity == null)
            return;
        if (this != mostCurrent)
			return;
		anywheresoftware.b4a.Msgbox.dismiss(true);
        if (!dontPause)
            BA.LogInfo("** Activity (homeuser) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (homeuser) Pause event (activity is not paused). **");
        if (mostCurrent != null)
            processBA.raiseEvent2(_activity, true, "activity_pause", false, activityBA.activity.isFinishing());		
        if (!dontPause) {
            processBA.setActivityPaused(true);
            mostCurrent = null;
        }

        if (!activityBA.activity.isFinishing())
			previousOne = new WeakReference<Activity>(this);
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        processBA.runHook("onpause", this, null);
	}

	@Override
	public void onDestroy() {
        super.onDestroy();
		previousOne = null;
        processBA.runHook("ondestroy", this, null);
	}
    @Override 
	public void onResume() {
		super.onResume();
        mostCurrent = this;
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (activityBA != null) { //will be null during activity create (which waits for AfterLayout).
        	ResumeMessage rm = new ResumeMessage(mostCurrent);
        	BA.handler.post(rm);
        }
        processBA.runHook("onresume", this, null);
	}
    private static class ResumeMessage implements Runnable {
    	private final WeakReference<Activity> activity;
    	public ResumeMessage(Activity activity) {
    		this.activity = new WeakReference<Activity>(activity);
    	}
		public void run() {
            homeuser mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (homeuser) Resume **");
            if (mc != mostCurrent)
                return;
		    processBA.raiseEvent(mc._activity, "activity_resume", (Object[])null);
		}
    }
	@Override
	protected void onActivityResult(int requestCode, int resultCode,
	      android.content.Intent data) {
		processBA.onActivityResult(requestCode, resultCode, data);
        processBA.runHook("onactivityresult", this, new Object[] {requestCode, resultCode});
	}
	private static void initializeGlobals() {
		processBA.raiseEvent2(null, true, "globals", false, (Object[])null);
	}
    public void onRequestPermissionsResult(int requestCode,
        String permissions[], int[] grantResults) {
        for (int i = 0;i < permissions.length;i++) {
            Object[] o = new Object[] {permissions[i], grantResults[i] == 0};
            processBA.raiseEventFromDifferentThread(null,null, 0, "activity_permissionresult", true, o);
        }
            
    }



public static void initializeProcessGlobals() {
             try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
}
public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.objects.collections.Map _data = null;
public static String _id = "";
public static String _username = "";
public static String _email = "";
public static String _first_name = "";
public static String _last_name = "";
public static String _avatar = "";
public static String _address = "";
public static String _phone = "";
public static int _status = 0;
public anywheresoftware.b4a.objects.LabelWrapper _labelheader = null;
public anywheresoftware.b4a.objects.LabelWrapper _labellogout = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelname = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelusername = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelbanner = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelhome = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelmenu = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelprofile = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _profileavatar = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnback = null;
public anywheresoftware.b4a.objects.ScrollViewWrapper _mainscroll = null;
public anywheresoftware.b4a.objects.PanelWrapper _navbar = null;
public anywheresoftware.b4a.objects.LabelWrapper _titlenavbar = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnev = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnlogout = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnrg = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelev = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelrg = null;
public b4a.example.dateutils _dateutils = null;
public b4a.DesaWisataSumpu.main _main = null;
public b4a.DesaWisataSumpu.core _core = null;
public b4a.DesaWisataSumpu.detailev _detailev = null;
public b4a.DesaWisataSumpu.detailrg _detailrg = null;
public b4a.DesaWisataSumpu.homevisitor _homevisitor = null;
public b4a.DesaWisataSumpu.listev _listev = null;
public b4a.DesaWisataSumpu.listrg _listrg = null;
public b4a.DesaWisataSumpu.mapsev _mapsev = null;
public b4a.DesaWisataSumpu.mapsrg _mapsrg = null;
public b4a.DesaWisataSumpu.starter _starter = null;
public b4a.DesaWisataSumpu.httputils2service _httputils2service = null;
public b4a.DesaWisataSumpu.b4xcollections _b4xcollections = null;
public b4a.DesaWisataSumpu.xuiviewsutils _xuiviewsutils = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="homeuser";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=1703939;
 //BA.debugLineNum = 1703939;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
mostCurrent._activity.LoadLayout("MainScrollView",mostCurrent.activityBA);
RDebugUtils.currentLine=1703940;
 //BA.debugLineNum = 1703940;BA.debugLine="MainScroll.Panel.LoadLayout(\"HomeUser\")";
mostCurrent._mainscroll.getPanel().LoadLayout("HomeUser",mostCurrent.activityBA);
RDebugUtils.currentLine=1703941;
 //BA.debugLineNum = 1703941;BA.debugLine="PanelHome.Height = MainScroll.Height";
mostCurrent._panelhome.setHeight(mostCurrent._mainscroll.getHeight());
RDebugUtils.currentLine=1703942;
 //BA.debugLineNum = 1703942;BA.debugLine="MainScroll.Panel.Height = MainScroll.Height";
mostCurrent._mainscroll.getPanel().setHeight(mostCurrent._mainscroll.getHeight());
RDebugUtils.currentLine=1703943;
 //BA.debugLineNum = 1703943;BA.debugLine="TitleNavbar.Text=\"Home User\"";
mostCurrent._titlenavbar.setText(BA.ObjectToCharSequence("Home User"));
RDebugUtils.currentLine=1703944;
 //BA.debugLineNum = 1703944;BA.debugLine="BtnBack.Visible = False";
mostCurrent._btnback.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1703946;
 //BA.debugLineNum = 1703946;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="homeuser";
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="homeuser";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=1769473;
 //BA.debugLineNum = 1769473;BA.debugLine="Log(\"HomeUser loaded\")";
anywheresoftware.b4a.keywords.Common.LogImpl("21769473","HomeUser loaded",0);
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="Core.ExecuteUrl(Main.API&\"profile\", \"id=\"&Main.ma";
mostCurrent._core._executeurl /*String*/ (mostCurrent.activityBA,mostCurrent._main._api /*String*/ +"profile","id="+mostCurrent._main._manager /*de.amberhome.objects.preferenceactivity.PreferenceManager*/ .GetString("user_id"),"Profile",homeuser.getObject());
RDebugUtils.currentLine=1769475;
 //BA.debugLineNum = 1769475;BA.debugLine="End Sub";
return "";
}
public static String  _btnev_click() throws Exception{
RDebugUtils.currentModule="homeuser";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnev_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnev_click", null));}
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Private Sub BtnEV_Click";
RDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="Log(\"Redirect to MapsEV Activity\")";
anywheresoftware.b4a.keywords.Common.LogImpl("22097153","Redirect to MapsEV Activity",0);
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="StartActivity(MapsEV)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._mapsev.getObject()));
RDebugUtils.currentLine=2097155;
 //BA.debugLineNum = 2097155;BA.debugLine="End Sub";
return "";
}
public static String  _btnlogout_click() throws Exception{
RDebugUtils.currentModule="homeuser";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnlogout_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnlogout_click", null));}
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Private Sub BtnLogout_Click";
RDebugUtils.currentLine=2031617;
 //BA.debugLineNum = 2031617;BA.debugLine="Log(\"Redirect to Main Activity\")";
anywheresoftware.b4a.keywords.Common.LogImpl("22031617","Redirect to Main Activity",0);
RDebugUtils.currentLine=2031619;
 //BA.debugLineNum = 2031619;BA.debugLine="Core.ExecuteUrlGet(Main.API&\"logout\", \"Logout\", M";
mostCurrent._core._executeurlget /*String*/ (mostCurrent.activityBA,mostCurrent._main._api /*String*/ +"logout","Logout",homeuser.getObject());
RDebugUtils.currentLine=2031620;
 //BA.debugLineNum = 2031620;BA.debugLine="End Sub";
return "";
}
public static String  _btnrg_click() throws Exception{
RDebugUtils.currentModule="homeuser";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnrg_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnrg_click", null));}
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Private Sub BtnRG_Click";
RDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="Log(\"Redirect to MapsRG Activity\")";
anywheresoftware.b4a.keywords.Common.LogImpl("21966081","Redirect to MapsRG Activity",0);
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="StartActivity(MapsRG)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._mapsrg.getObject()));
RDebugUtils.currentLine=1966083;
 //BA.debugLineNum = 1966083;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(b4a.DesaWisataSumpu.httpjob _job) throws Exception{
RDebugUtils.currentModule="homeuser";
if (Debug.shouldDelegate(mostCurrent.activityBA, "jobdone", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "jobdone", new Object[] {_job}));}
String _res = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _map = null;
anywheresoftware.b4a.objects.collections.Map _avatarmap = null;
String _avatarpath = "";
anywheresoftware.b4a.objects.collections.JSONParser _errorparser = null;
anywheresoftware.b4a.objects.collections.Map _errormap = null;
String _error = "";
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Sub JobDone (Job As HttpJob)";
RDebugUtils.currentLine=1900545;
 //BA.debugLineNum = 1900545;BA.debugLine="Log(\"JobName = \" & Job.JobName & \", Success = \" &";
anywheresoftware.b4a.keywords.Common.LogImpl("21900545","JobName = "+_job._jobname /*String*/ +", Success = "+BA.ObjectToString(_job._success /*boolean*/ ),0);
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="If Job.Success Then";
if (_job._success /*boolean*/ ) { 
RDebugUtils.currentLine=1900547;
 //BA.debugLineNum = 1900547;BA.debugLine="Dim res As String";
_res = "";
RDebugUtils.currentLine=1900548;
 //BA.debugLineNum = 1900548;BA.debugLine="res = Job.GetString";
_res = _job._getstring /*String*/ (null);
RDebugUtils.currentLine=1900549;
 //BA.debugLineNum = 1900549;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=1900550;
 //BA.debugLineNum = 1900550;BA.debugLine="parser.Initialize(res)";
_parser.Initialize(_res);
RDebugUtils.currentLine=1900551;
 //BA.debugLineNum = 1900551;BA.debugLine="Log(\"Response from server :\"&res)";
anywheresoftware.b4a.keywords.Common.LogImpl("21900551","Response from server :"+_res,0);
RDebugUtils.currentLine=1900552;
 //BA.debugLineNum = 1900552;BA.debugLine="Select Job.JobName";
switch (BA.switchObjectToInt(_job._jobname /*String*/ ,"Profile","Logout")) {
case 0: {
RDebugUtils.currentLine=1900554;
 //BA.debugLineNum = 1900554;BA.debugLine="Try";
try {RDebugUtils.currentLine=1900556;
 //BA.debugLineNum = 1900556;BA.debugLine="Dim map As Map";
_map = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=1900557;
 //BA.debugLineNum = 1900557;BA.debugLine="map = parser.NextObject";
_map = _parser.NextObject();
RDebugUtils.currentLine=1900558;
 //BA.debugLineNum = 1900558;BA.debugLine="data = map.Get(\"data\")";
_data = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_map.Get((Object)("data"))));
RDebugUtils.currentLine=1900559;
 //BA.debugLineNum = 1900559;BA.debugLine="id = data.Get(\"id\")";
_id = BA.ObjectToString(_data.Get((Object)("id")));
RDebugUtils.currentLine=1900560;
 //BA.debugLineNum = 1900560;BA.debugLine="email = data.Get(\"email\")";
_email = BA.ObjectToString(_data.Get((Object)("email")));
RDebugUtils.currentLine=1900561;
 //BA.debugLineNum = 1900561;BA.debugLine="username = data.Get(\"username\")";
_username = BA.ObjectToString(_data.Get((Object)("username")));
RDebugUtils.currentLine=1900562;
 //BA.debugLineNum = 1900562;BA.debugLine="first_name = data.Get(\"first_name\")";
_first_name = BA.ObjectToString(_data.Get((Object)("first_name")));
RDebugUtils.currentLine=1900563;
 //BA.debugLineNum = 1900563;BA.debugLine="last_name = data.Get(\"last_name\")";
_last_name = BA.ObjectToString(_data.Get((Object)("last_name")));
RDebugUtils.currentLine=1900564;
 //BA.debugLineNum = 1900564;BA.debugLine="avatar = data.Get(\"avatar\")";
_avatar = BA.ObjectToString(_data.Get((Object)("avatar")));
RDebugUtils.currentLine=1900565;
 //BA.debugLineNum = 1900565;BA.debugLine="address = data.Get(\"address\")";
_address = BA.ObjectToString(_data.Get((Object)("address")));
RDebugUtils.currentLine=1900566;
 //BA.debugLineNum = 1900566;BA.debugLine="phone = data.Get(\"phone\")";
_phone = BA.ObjectToString(_data.Get((Object)("phone")));
RDebugUtils.currentLine=1900568;
 //BA.debugLineNum = 1900568;BA.debugLine="LabelName.Text = first_name&\" \"&last_name";
mostCurrent._labelname.setText(BA.ObjectToCharSequence(_first_name+" "+_last_name));
RDebugUtils.currentLine=1900569;
 //BA.debugLineNum = 1900569;BA.debugLine="LabelUsername.Text = \"@\"&username";
mostCurrent._labelusername.setText(BA.ObjectToCharSequence("@"+_username));
RDebugUtils.currentLine=1900571;
 //BA.debugLineNum = 1900571;BA.debugLine="Dim avatarMap As Map";
_avatarmap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=1900572;
 //BA.debugLineNum = 1900572;BA.debugLine="Dim avatarPath As String";
_avatarpath = "";
RDebugUtils.currentLine=1900573;
 //BA.debugLineNum = 1900573;BA.debugLine="avatarPath = Main.server & \"media/photos/\" &a";
_avatarpath = mostCurrent._main._server /*String*/ +"media/photos/"+_avatar;
RDebugUtils.currentLine=1900574;
 //BA.debugLineNum = 1900574;BA.debugLine="avatarMap.Initialize";
_avatarmap.Initialize();
RDebugUtils.currentLine=1900575;
 //BA.debugLineNum = 1900575;BA.debugLine="avatarMap.Put(ProfileAvatar, avatarPath)";
_avatarmap.Put((Object)(mostCurrent._profileavatar.getObject()),(Object)(_avatarpath));
RDebugUtils.currentLine=1900576;
 //BA.debugLineNum = 1900576;BA.debugLine="CallSubDelayed2(Starter, \"Download\", avatarMa";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(mostCurrent._starter.getObject()),"Download",(Object)(_avatarmap));
 } 
       catch (Exception e31) {
			processBA.setLastException(e31);RDebugUtils.currentLine=1900578;
 //BA.debugLineNum = 1900578;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("21900578",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 };
 break; }
case 1: {
RDebugUtils.currentLine=1900582;
 //BA.debugLineNum = 1900582;BA.debugLine="Try";
try {RDebugUtils.currentLine=1900583;
 //BA.debugLineNum = 1900583;BA.debugLine="Dim map As Map";
_map = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=1900584;
 //BA.debugLineNum = 1900584;BA.debugLine="map = parser.NextObject";
_map = _parser.NextObject();
RDebugUtils.currentLine=1900585;
 //BA.debugLineNum = 1900585;BA.debugLine="status = map.Get(\"status\")";
_status = (int)(BA.ObjectToNumber(_map.Get((Object)("status"))));
RDebugUtils.currentLine=1900586;
 //BA.debugLineNum = 1900586;BA.debugLine="If status == 200 Then";
if (_status==200) { 
RDebugUtils.currentLine=1900587;
 //BA.debugLineNum = 1900587;BA.debugLine="Msgbox(\"Successfully logged out\", \"Log Out\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Successfully logged out"),BA.ObjectToCharSequence("Log Out"),mostCurrent.activityBA);
RDebugUtils.currentLine=1900588;
 //BA.debugLineNum = 1900588;BA.debugLine="Main.manager.SetBoolean(\"is_login\", False)";
mostCurrent._main._manager /*de.amberhome.objects.preferenceactivity.PreferenceManager*/ .SetBoolean("is_login",anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1900589;
 //BA.debugLineNum = 1900589;BA.debugLine="Main.manager.SetBoolean(\"visitor\", False)";
mostCurrent._main._manager /*de.amberhome.objects.preferenceactivity.PreferenceManager*/ .SetBoolean("visitor",anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1900590;
 //BA.debugLineNum = 1900590;BA.debugLine="Main.manager.SetBoolean(\"user\", False)";
mostCurrent._main._manager /*de.amberhome.objects.preferenceactivity.PreferenceManager*/ .SetBoolean("user",anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1900591;
 //BA.debugLineNum = 1900591;BA.debugLine="Log(\"Successfully logged out\")";
anywheresoftware.b4a.keywords.Common.LogImpl("21900591","Successfully logged out",0);
RDebugUtils.currentLine=1900592;
 //BA.debugLineNum = 1900592;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=1900593;
 //BA.debugLineNum = 1900593;BA.debugLine="StartActivity(Main)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._main.getObject()));
 };
 } 
       catch (Exception e48) {
			processBA.setLastException(e48);RDebugUtils.currentLine=1900596;
 //BA.debugLineNum = 1900596;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("21900596",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 };
 break; }
}
;
 }else {
RDebugUtils.currentLine=1900601;
 //BA.debugLineNum = 1900601;BA.debugLine="Dim errorParser As JSONParser";
_errorparser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=1900602;
 //BA.debugLineNum = 1900602;BA.debugLine="errorParser.Initialize(Job.ErrorMessage)";
_errorparser.Initialize(_job._errormessage /*String*/ );
RDebugUtils.currentLine=1900604;
 //BA.debugLineNum = 1900604;BA.debugLine="Dim errorMap As Map";
_errormap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=1900605;
 //BA.debugLineNum = 1900605;BA.debugLine="errorMap = errorParser.NextObject";
_errormap = _errorparser.NextObject();
RDebugUtils.currentLine=1900606;
 //BA.debugLineNum = 1900606;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.LogImpl("21900606","Error: "+_job._errormessage /*String*/ ,0);
RDebugUtils.currentLine=1900608;
 //BA.debugLineNum = 1900608;BA.debugLine="Dim error As String";
_error = "";
RDebugUtils.currentLine=1900609;
 //BA.debugLineNum = 1900609;BA.debugLine="error = errorMap.Get(\"message\")";
_error = BA.ObjectToString(_errormap.Get((Object)("message")));
RDebugUtils.currentLine=1900610;
 //BA.debugLineNum = 1900610;BA.debugLine="ToastMessageShow(\"Error: \" & error, True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Error: "+_error),anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=1900612;
 //BA.debugLineNum = 1900612;BA.debugLine="Job.Release";
_job._release /*String*/ (null);
RDebugUtils.currentLine=1900613;
 //BA.debugLineNum = 1900613;BA.debugLine="End Sub";
return "";
}
}