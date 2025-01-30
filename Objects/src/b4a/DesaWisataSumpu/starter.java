package b4a.DesaWisataSumpu;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.objects.ServiceHelper;
import anywheresoftware.b4a.debug.*;

public class starter extends android.app.Service{
	public static class starter_BR extends android.content.BroadcastReceiver {

		@Override
		public void onReceive(android.content.Context context, android.content.Intent intent) {
            BA.LogInfo("** Receiver (starter) OnReceive **");
			android.content.Intent in = new android.content.Intent(context, starter.class);
			if (intent != null)
				in.putExtra("b4a_internal_intent", intent);
            ServiceHelper.StarterHelper.startServiceFromReceiver (context, in, true, anywheresoftware.b4a.ShellBA.class);
		}

	}
    static starter mostCurrent;
	public static BA processBA;
    private ServiceHelper _service;
    public static Class<?> getObject() {
		return starter.class;
	}
	@Override
	public void onCreate() {
        super.onCreate();
        mostCurrent = this;
        if (processBA == null) {
		    processBA = new anywheresoftware.b4a.ShellBA(this, null, null, "b4a.DesaWisataSumpu", "b4a.DesaWisataSumpu.starter");
            if (BA.isShellModeRuntimeCheck(processBA)) {
                processBA.raiseEvent2(null, true, "SHELL", false);
		    }
            try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            processBA.loadHtSubs(this.getClass());
            ServiceHelper.init();
        }
        _service = new ServiceHelper(this);
        processBA.service = this;
        
        if (BA.isShellModeRuntimeCheck(processBA)) {
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.DesaWisataSumpu.starter", processBA, _service, anywheresoftware.b4a.keywords.Common.Density);
		}
        if (!true && ServiceHelper.StarterHelper.startFromServiceCreate(processBA, false) == false) {
				
		}
		else {
            processBA.setActivityPaused(false);
            BA.LogInfo("*** Service (starter) Create ***");
            processBA.raiseEvent(null, "service_create");
        }
        processBA.runHook("oncreate", this, null);
        if (true) {
			if (ServiceHelper.StarterHelper.runWaitForLayouts() == false) {
                BA.LogInfo("stopping spontaneous created service");
                stopSelf();
            }
		}
    }
		@Override
	public void onStart(android.content.Intent intent, int startId) {
		onStartCommand(intent, 0, 0);
    }
    @Override
    public int onStartCommand(final android.content.Intent intent, int flags, int startId) {
    	if (ServiceHelper.StarterHelper.onStartCommand(processBA, new Runnable() {
            public void run() {
                handleStart(intent);
            }}))
			;
		else {
			ServiceHelper.StarterHelper.addWaitForLayout (new Runnable() {
				public void run() {
                    processBA.setActivityPaused(false);
                    BA.LogInfo("** Service (starter) Create **");
                    processBA.raiseEvent(null, "service_create");
					handleStart(intent);
                    ServiceHelper.StarterHelper.removeWaitForLayout();
				}
			});
		}
        processBA.runHook("onstartcommand", this, new Object[] {intent, flags, startId});
		return android.app.Service.START_NOT_STICKY;
    }
    public void onTaskRemoved(android.content.Intent rootIntent) {
        super.onTaskRemoved(rootIntent);
        if (true)
            processBA.raiseEvent(null, "service_taskremoved");
            
    }
    private void handleStart(android.content.Intent intent) {
    	BA.LogInfo("** Service (starter) Start **");
    	java.lang.reflect.Method startEvent = processBA.htSubs.get("service_start");
    	if (startEvent != null) {
    		if (startEvent.getParameterTypes().length > 0) {
    			anywheresoftware.b4a.objects.IntentWrapper iw = ServiceHelper.StarterHelper.handleStartIntent(intent, _service, processBA);
    			processBA.raiseEvent(null, "service_start", iw);
    		}
    		else {
    			processBA.raiseEvent(null, "service_start");
    		}
    	}
    }

	public void onTimeout(int startId) {
        BA.LogInfo("** Service (starter) Timeout **");
        anywheresoftware.b4a.objects.collections.Map params = new anywheresoftware.b4a.objects.collections.Map();
        params.Initialize();
        params.Put("StartId", startId);
        processBA.raiseEvent(null, "service_timeout", params);
            
    }
	@Override
	public void onDestroy() {
        super.onDestroy();
        if (true) {
            BA.LogInfo("** Service (starter) Destroy (ignored)**");
        }
        else {
            BA.LogInfo("** Service (starter) Destroy **");
		    processBA.raiseEvent(null, "service_destroy");
            processBA.service = null;
		    mostCurrent = null;
		    processBA.setActivityPaused(true);
            processBA.runHook("ondestroy", this, null);
        }
	}

@Override
	public android.os.IBinder onBind(android.content.Intent intent) {
		return null;
	}
public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.objects.collections.Map _tasks = null;
public static anywheresoftware.b4a.objects.collections.Map _cache = null;
public static anywheresoftware.b4a.objects.collections.Map _ongoingtasks = null;
public static anywheresoftware.b4a.gps.GPS _gps1 = null;
public static anywheresoftware.b4a.objects.RuntimePermissions _rp = null;
public static boolean _gpsstarted = false;
public static String _lat = "";
public static String _lng = "";
public static String _mapstatus = "";
public static int _webviewloading = 0;
public static anywheresoftware.b4a.objects.collections.Map _selectedobj = null;
public b4a.example.dateutils _dateutils = null;
public b4a.DesaWisataSumpu.main _main = null;
public b4a.DesaWisataSumpu.core _core = null;
public b4a.DesaWisataSumpu.detailev _detailev = null;
public b4a.DesaWisataSumpu.detailrg _detailrg = null;
public b4a.DesaWisataSumpu.homeuser _homeuser = null;
public b4a.DesaWisataSumpu.homevisitor _homevisitor = null;
public b4a.DesaWisataSumpu.listev _listev = null;
public b4a.DesaWisataSumpu.listrg _listrg = null;
public b4a.DesaWisataSumpu.mapsev _mapsev = null;
public b4a.DesaWisataSumpu.mapsrg _mapsrg = null;
public b4a.DesaWisataSumpu.httputils2service _httputils2service = null;
public b4a.DesaWisataSumpu.b4xcollections _b4xcollections = null;
public b4a.DesaWisataSumpu.xuiviewsutils _xuiviewsutils = null;
public static boolean  _application_error(anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "application_error", false))
	 {return ((Boolean) Debug.delegate(processBA, "application_error", new Object[] {_error,_stacktrace}));}
RDebugUtils.currentLine=6291456;
 //BA.debugLineNum = 6291456;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
RDebugUtils.currentLine=6291457;
 //BA.debugLineNum = 6291457;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=6291458;
 //BA.debugLineNum = 6291458;BA.debugLine="End Sub";
return false;
}
public static anywheresoftware.b4a.objects.drawable.CanvasWrapper  _createbitmap() throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "createbitmap", false))
	 {return ((anywheresoftware.b4a.objects.drawable.CanvasWrapper) Debug.delegate(processBA, "createbitmap", null));}
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper _cvs = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper _rect = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.PathWrapper _path = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
float _x = 0f;
float _y = 0f;
float _radius = 0f;
RDebugUtils.currentLine=6684672;
 //BA.debugLineNum = 6684672;BA.debugLine="Sub CreateBitmap As Canvas";
RDebugUtils.currentLine=6684673;
 //BA.debugLineNum = 6684673;BA.debugLine="Public bmp  As Bitmap";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=6684674;
 //BA.debugLineNum = 6684674;BA.debugLine="bmp.InitializeMutable(200dip, 200dip)";
_bmp.InitializeMutable(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (200)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (200)));
RDebugUtils.currentLine=6684675;
 //BA.debugLineNum = 6684675;BA.debugLine="Public cvs As Canvas";
_cvs = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
RDebugUtils.currentLine=6684676;
 //BA.debugLineNum = 6684676;BA.debugLine="cvs.Initialize2(bmp)";
_cvs.Initialize2((android.graphics.Bitmap)(_bmp.getObject()));
RDebugUtils.currentLine=6684677;
 //BA.debugLineNum = 6684677;BA.debugLine="Public rect As Rect";
_rect = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper();
RDebugUtils.currentLine=6684678;
 //BA.debugLineNum = 6684678;BA.debugLine="rect.Initialize(0, 0, bmp.Width, bmp.Height)";
_rect.Initialize((int) (0),(int) (0),_bmp.getWidth(),_bmp.getHeight());
RDebugUtils.currentLine=6684679;
 //BA.debugLineNum = 6684679;BA.debugLine="cvs.DrawRect(rect, Colors.Transparent, True, 0)";
_cvs.DrawRect((android.graphics.Rect)(_rect.getObject()),anywheresoftware.b4a.keywords.Common.Colors.Transparent,anywheresoftware.b4a.keywords.Common.True,(float) (0));
RDebugUtils.currentLine=6684680;
 //BA.debugLineNum = 6684680;BA.debugLine="Public path As Path";
_path = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.PathWrapper();
RDebugUtils.currentLine=6684681;
 //BA.debugLineNum = 6684681;BA.debugLine="path.Initialize(0, 0)";
_path.Initialize((float) (0),(float) (0));
RDebugUtils.currentLine=6684682;
 //BA.debugLineNum = 6684682;BA.debugLine="Public jo As JavaObject = path";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_path.getObject()));
RDebugUtils.currentLine=6684683;
 //BA.debugLineNum = 6684683;BA.debugLine="Public x = 100dip, y = 100dip, radius = 100dip As";
_x = (float) (anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)));
_y = (float) (anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)));
_radius = (float) (anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)));
RDebugUtils.currentLine=6684684;
 //BA.debugLineNum = 6684684;BA.debugLine="jo.RunMethod(\"addCircle\", Array As Object(x, y, r";
_jo.RunMethod("addCircle",new Object[]{(Object)(_x),(Object)(_y),(Object)(_radius),(Object)("CW")});
RDebugUtils.currentLine=6684685;
 //BA.debugLineNum = 6684685;BA.debugLine="cvs.ClipPath(path)";
_cvs.ClipPath((android.graphics.Path)(_path.getObject()));
RDebugUtils.currentLine=6684686;
 //BA.debugLineNum = 6684686;BA.debugLine="Return cvs";
if (true) return _cvs;
RDebugUtils.currentLine=6684687;
 //BA.debugLineNum = 6684687;BA.debugLine="End Sub";
return null;
}
public static String  _download(anywheresoftware.b4a.objects.collections.Map _imagemap) throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "download", false))
	 {return ((String) Debug.delegate(processBA, "download", new Object[] {_imagemap}));}
int _i = 0;
String _path = "";
anywheresoftware.b4a.objects.ImageViewWrapper _iv = null;
b4a.DesaWisataSumpu.httpjob _job = null;
RDebugUtils.currentLine=6553600;
 //BA.debugLineNum = 6553600;BA.debugLine="Sub Download (ImageMap As Map)";
RDebugUtils.currentLine=6553601;
 //BA.debugLineNum = 6553601;BA.debugLine="For i = 0 To ImageMap.Size - 1";
{
final int step1 = 1;
final int limit1 = (int) (_imagemap.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=6553602;
 //BA.debugLineNum = 6553602;BA.debugLine="tasks.Put(ImageMap.GetKeyAt(i), ImageMap.GetValu";
_tasks.Put(_imagemap.GetKeyAt(_i),_imagemap.GetValueAt(_i));
RDebugUtils.currentLine=6553603;
 //BA.debugLineNum = 6553603;BA.debugLine="Public path As String = ImageMap.GetValueAt(i)";
_path = BA.ObjectToString(_imagemap.GetValueAt(_i));
RDebugUtils.currentLine=6553604;
 //BA.debugLineNum = 6553604;BA.debugLine="If cache.ContainsKey(path) Then";
if (_cache.ContainsKey((Object)(_path))) { 
RDebugUtils.currentLine=6553605;
 //BA.debugLineNum = 6553605;BA.debugLine="Public iv As ImageView = ImageMap.GetKeyAt(i)";
_iv = new anywheresoftware.b4a.objects.ImageViewWrapper();
_iv = (anywheresoftware.b4a.objects.ImageViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ImageViewWrapper(), (android.widget.ImageView)(_imagemap.GetKeyAt(_i)));
RDebugUtils.currentLine=6553606;
 //BA.debugLineNum = 6553606;BA.debugLine="iv.SetBackgroundImage(cache.Get(path))";
_iv.SetBackgroundImageNew((android.graphics.Bitmap)(_cache.Get((Object)(_path))));
 }else 
{RDebugUtils.currentLine=6553607;
 //BA.debugLineNum = 6553607;BA.debugLine="Else If ongoingTasks.ContainsKey(path) = False T";
if (_ongoingtasks.ContainsKey((Object)(_path))==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=6553608;
 //BA.debugLineNum = 6553608;BA.debugLine="ongoingTasks.Put(path, \"\")";
_ongoingtasks.Put((Object)(_path),(Object)(""));
RDebugUtils.currentLine=6553609;
 //BA.debugLineNum = 6553609;BA.debugLine="Public Job As HttpJob";
_job = new b4a.DesaWisataSumpu.httpjob();
RDebugUtils.currentLine=6553610;
 //BA.debugLineNum = 6553610;BA.debugLine="Job.Initialize(path, Me)";
_job._initialize /*String*/ (null,processBA,_path,starter.getObject());
RDebugUtils.currentLine=6553611;
 //BA.debugLineNum = 6553611;BA.debugLine="Job.Download(path)";
_job._download /*String*/ (null,_path);
 }}
;
 }
};
RDebugUtils.currentLine=6553614;
 //BA.debugLineNum = 6553614;BA.debugLine="End Sub";
return "";
}
public static String  _drawroundbitmap(anywheresoftware.b4a.objects.drawable.CanvasWrapper _cvs,anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp) throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "drawroundbitmap", false))
	 {return ((String) Debug.delegate(processBA, "drawroundbitmap", new Object[] {_cvs,_bmp}));}
anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper _r = null;
RDebugUtils.currentLine=6750208;
 //BA.debugLineNum = 6750208;BA.debugLine="Sub DrawRoundBitmap (cvs As Canvas, bmp As Bitmap)";
RDebugUtils.currentLine=6750209;
 //BA.debugLineNum = 6750209;BA.debugLine="Public r As Rect";
_r = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper();
RDebugUtils.currentLine=6750210;
 //BA.debugLineNum = 6750210;BA.debugLine="r.Initialize(0, 0, cvs.Bitmap.Width, cvs.Bitmap.H";
_r.Initialize((int) (0),(int) (0),_cvs.getBitmap().getWidth(),_cvs.getBitmap().getHeight());
RDebugUtils.currentLine=6750211;
 //BA.debugLineNum = 6750211;BA.debugLine="cvs.DrawBitmap(bmp, Null, r)";
_cvs.DrawBitmap((android.graphics.Bitmap)(_bmp.getObject()),(android.graphics.Rect)(anywheresoftware.b4a.keywords.Common.Null),(android.graphics.Rect)(_r.getObject()));
RDebugUtils.currentLine=6750212;
 //BA.debugLineNum = 6750212;BA.debugLine="End Sub";
return "";
}
public static String  _gps_locationchanged(anywheresoftware.b4a.gps.LocationWrapper _location1) throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "gps_locationchanged", false))
	 {return ((String) Debug.delegate(processBA, "gps_locationchanged", new Object[] {_location1}));}
String _currentlat = "";
String _currentlng = "";
RDebugUtils.currentLine=6815744;
 //BA.debugLineNum = 6815744;BA.debugLine="Sub GPS_LocationChanged(Location1 As Location)";
RDebugUtils.currentLine=6815745;
 //BA.debugLineNum = 6815745;BA.debugLine="Dim currentLat, currentLng As String";
_currentlat = "";
_currentlng = "";
RDebugUtils.currentLine=6815746;
 //BA.debugLineNum = 6815746;BA.debugLine="currentLat = Location1.Latitude";
_currentlat = BA.NumberToString(_location1.getLatitude());
RDebugUtils.currentLine=6815747;
 //BA.debugLineNum = 6815747;BA.debugLine="currentLng = Location1.Longitude";
_currentlng = BA.NumberToString(_location1.getLongitude());
RDebugUtils.currentLine=6815748;
 //BA.debugLineNum = 6815748;BA.debugLine="If currentLat <> lat And currentLng <> lng Then";
if ((_currentlat).equals(_lat) == false && (_currentlng).equals(_lng) == false) { 
RDebugUtils.currentLine=6815749;
 //BA.debugLineNum = 6815749;BA.debugLine="lat = currentLat";
_lat = _currentlat;
RDebugUtils.currentLine=6815750;
 //BA.debugLineNum = 6815750;BA.debugLine="lng = currentLng";
_lng = _currentlng;
RDebugUtils.currentLine=6815751;
 //BA.debugLineNum = 6815751;BA.debugLine="Log(\"Current Location\")";
anywheresoftware.b4a.keywords.Common.LogImpl("26815751","Current Location",0);
RDebugUtils.currentLine=6815752;
 //BA.debugLineNum = 6815752;BA.debugLine="Log(\"Lat = \" & lat)";
anywheresoftware.b4a.keywords.Common.LogImpl("26815752","Lat = "+_lat,0);
RDebugUtils.currentLine=6815753;
 //BA.debugLineNum = 6815753;BA.debugLine="Log(\"Lng = \" & lng)";
anywheresoftware.b4a.keywords.Common.LogImpl("26815753","Lng = "+_lng,0);
RDebugUtils.currentLine=6815754;
 //BA.debugLineNum = 6815754;BA.debugLine="If webviewLoading == 100 Then";
if (_webviewloading==100) { 
RDebugUtils.currentLine=6815755;
 //BA.debugLineNum = 6815755;BA.debugLine="If mapStatus == \"RG\" Then";
if ((_mapstatus).equals("RG")) { 
RDebugUtils.currentLine=6815756;
 //BA.debugLineNum = 6815756;BA.debugLine="CallSub(MapsRG, \"UpdateLocation\")";
anywheresoftware.b4a.keywords.Common.CallSubDebug(processBA,(Object)(mostCurrent._mapsrg.getObject()),"UpdateLocation");
 }else 
{RDebugUtils.currentLine=6815757;
 //BA.debugLineNum = 6815757;BA.debugLine="Else If mapStatus == \"EV\" Then";
if ((_mapstatus).equals("EV")) { 
RDebugUtils.currentLine=6815758;
 //BA.debugLineNum = 6815758;BA.debugLine="CallSub(MapsEV, \"UpdateLocation\")";
anywheresoftware.b4a.keywords.Common.CallSubDebug(processBA,(Object)(mostCurrent._mapsev.getObject()),"UpdateLocation");
 }}
;
 };
 };
RDebugUtils.currentLine=6815762;
 //BA.debugLineNum = 6815762;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(b4a.DesaWisataSumpu.httpjob _job) throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "jobdone", false))
	 {return ((String) Debug.delegate(processBA, "jobdone", new Object[] {_job}));}
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp = null;
int _i = 0;
String _path = "";
anywheresoftware.b4a.objects.ImageViewWrapper _iv = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper _canvas = null;
RDebugUtils.currentLine=6619136;
 //BA.debugLineNum = 6619136;BA.debugLine="Sub JobDone (Job As HttpJob)";
RDebugUtils.currentLine=6619137;
 //BA.debugLineNum = 6619137;BA.debugLine="ongoingTasks.Remove(Job.JobName)";
_ongoingtasks.Remove((Object)(_job._jobname /*String*/ ));
RDebugUtils.currentLine=6619138;
 //BA.debugLineNum = 6619138;BA.debugLine="If Job.Success Then";
if (_job._success /*boolean*/ ) { 
RDebugUtils.currentLine=6619139;
 //BA.debugLineNum = 6619139;BA.debugLine="Public bmp As Bitmap = Job.GetBitmap";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_bmp = _job._getbitmap /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ (null);
RDebugUtils.currentLine=6619140;
 //BA.debugLineNum = 6619140;BA.debugLine="If tasks.IsInitialized Then";
if (_tasks.IsInitialized()) { 
RDebugUtils.currentLine=6619141;
 //BA.debugLineNum = 6619141;BA.debugLine="For i = 0 To tasks.Size - 1";
{
final int step5 = 1;
final int limit5 = (int) (_tasks.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=6619142;
 //BA.debugLineNum = 6619142;BA.debugLine="Public path As String = tasks.GetValueAt(i)";
_path = BA.ObjectToString(_tasks.GetValueAt(_i));
RDebugUtils.currentLine=6619143;
 //BA.debugLineNum = 6619143;BA.debugLine="If path = Job.JobName Then";
if ((_path).equals(_job._jobname /*String*/ )) { 
RDebugUtils.currentLine=6619144;
 //BA.debugLineNum = 6619144;BA.debugLine="Public iv As ImageView = tasks.GetKeyAt(i)";
_iv = new anywheresoftware.b4a.objects.ImageViewWrapper();
_iv = (anywheresoftware.b4a.objects.ImageViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ImageViewWrapper(), (android.widget.ImageView)(_tasks.GetKeyAt(_i)));
RDebugUtils.currentLine=6619145;
 //BA.debugLineNum = 6619145;BA.debugLine="Public canvas As Canvas = CreateBitmap";
_canvas = _createbitmap();
RDebugUtils.currentLine=6619146;
 //BA.debugLineNum = 6619146;BA.debugLine="DrawRoundBitmap(canvas, bmp)";
_drawroundbitmap(_canvas,_bmp);
RDebugUtils.currentLine=6619147;
 //BA.debugLineNum = 6619147;BA.debugLine="iv.SetBackgroundImage(canvas.Bitmap)";
_iv.SetBackgroundImageNew((android.graphics.Bitmap)(_canvas.getBitmap().getObject()));
RDebugUtils.currentLine=6619148;
 //BA.debugLineNum = 6619148;BA.debugLine="cache.Put(Job.JobName, canvas.Bitmap)";
_cache.Put((Object)(_job._jobname /*String*/ ),(Object)(_canvas.getBitmap().getObject()));
 };
 }
};
 };
 }else {
RDebugUtils.currentLine=6619153;
 //BA.debugLineNum = 6619153;BA.debugLine="Log(\"Error downloading image: \" & Job.JobName &";
anywheresoftware.b4a.keywords.Common.LogImpl("26619153","Error downloading image: "+_job._jobname /*String*/ +anywheresoftware.b4a.keywords.Common.CRLF+_job._errormessage /*String*/ ,0);
 };
RDebugUtils.currentLine=6619155;
 //BA.debugLineNum = 6619155;BA.debugLine="Job.Release";
_job._release /*String*/ (null);
RDebugUtils.currentLine=6619156;
 //BA.debugLineNum = 6619156;BA.debugLine="End Sub";
return "";
}
public static String  _service_create() throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "service_create", false))
	 {return ((String) Debug.delegate(processBA, "service_create", null));}
RDebugUtils.currentLine=6094848;
 //BA.debugLineNum = 6094848;BA.debugLine="Sub Service_Create";
RDebugUtils.currentLine=6094851;
 //BA.debugLineNum = 6094851;BA.debugLine="tasks.Initialize";
_tasks.Initialize();
RDebugUtils.currentLine=6094852;
 //BA.debugLineNum = 6094852;BA.debugLine="cache.Initialize";
_cache.Initialize();
RDebugUtils.currentLine=6094853;
 //BA.debugLineNum = 6094853;BA.debugLine="ongoingTasks.Initialize";
_ongoingtasks.Initialize();
RDebugUtils.currentLine=6094854;
 //BA.debugLineNum = 6094854;BA.debugLine="GPS1.Initialize(\"GPS\")";
_gps1.Initialize("GPS");
RDebugUtils.currentLine=6094855;
 //BA.debugLineNum = 6094855;BA.debugLine="End Sub";
return "";
}
public static String  _service_destroy() throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "service_destroy", false))
	 {return ((String) Debug.delegate(processBA, "service_destroy", null));}
RDebugUtils.currentLine=6356992;
 //BA.debugLineNum = 6356992;BA.debugLine="Sub Service_Destroy";
RDebugUtils.currentLine=6356994;
 //BA.debugLineNum = 6356994;BA.debugLine="End Sub";
return "";
}
public static String  _service_start(anywheresoftware.b4a.objects.IntentWrapper _startingintent) throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "service_start", false))
	 {return ((String) Debug.delegate(processBA, "service_start", new Object[] {_startingintent}));}
RDebugUtils.currentLine=6160384;
 //BA.debugLineNum = 6160384;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
RDebugUtils.currentLine=6160385;
 //BA.debugLineNum = 6160385;BA.debugLine="Service.StopAutomaticForeground 'Starter service";
mostCurrent._service.StopAutomaticForeground();
RDebugUtils.currentLine=6160386;
 //BA.debugLineNum = 6160386;BA.debugLine="End Sub";
return "";
}
public static String  _service_taskremoved() throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "service_taskremoved", false))
	 {return ((String) Debug.delegate(processBA, "service_taskremoved", null));}
RDebugUtils.currentLine=6225920;
 //BA.debugLineNum = 6225920;BA.debugLine="Sub Service_TaskRemoved";
RDebugUtils.currentLine=6225922;
 //BA.debugLineNum = 6225922;BA.debugLine="End Sub";
return "";
}
public static String  _startgps() throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "startgps", false))
	 {return ((String) Debug.delegate(processBA, "startgps", null));}
RDebugUtils.currentLine=6422528;
 //BA.debugLineNum = 6422528;BA.debugLine="Sub StartGPS";
RDebugUtils.currentLine=6422529;
 //BA.debugLineNum = 6422529;BA.debugLine="If gpsStarted = False Then";
if (_gpsstarted==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=6422530;
 //BA.debugLineNum = 6422530;BA.debugLine="GPS1.Start(0, 0)";
_gps1.Start(processBA,(long) (0),(float) (0));
RDebugUtils.currentLine=6422531;
 //BA.debugLineNum = 6422531;BA.debugLine="gpsStarted = True";
_gpsstarted = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=6422532;
 //BA.debugLineNum = 6422532;BA.debugLine="Log(\"GPS is started\")";
anywheresoftware.b4a.keywords.Common.LogImpl("26422532","GPS is started",0);
 };
RDebugUtils.currentLine=6422534;
 //BA.debugLineNum = 6422534;BA.debugLine="End Sub";
return "";
}
public static String  _stopgps() throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "stopgps", false))
	 {return ((String) Debug.delegate(processBA, "stopgps", null));}
RDebugUtils.currentLine=6488064;
 //BA.debugLineNum = 6488064;BA.debugLine="Sub StopGPS";
RDebugUtils.currentLine=6488065;
 //BA.debugLineNum = 6488065;BA.debugLine="If gpsStarted Then";
if (_gpsstarted) { 
RDebugUtils.currentLine=6488066;
 //BA.debugLineNum = 6488066;BA.debugLine="GPS1.Stop";
_gps1.Stop();
RDebugUtils.currentLine=6488067;
 //BA.debugLineNum = 6488067;BA.debugLine="gpsStarted = False";
_gpsstarted = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=6488068;
 //BA.debugLineNum = 6488068;BA.debugLine="Log(\"GPS is stopped\")";
anywheresoftware.b4a.keywords.Common.LogImpl("26488068","GPS is stopped",0);
 };
RDebugUtils.currentLine=6488070;
 //BA.debugLineNum = 6488070;BA.debugLine="End Sub";
return "";
}
}