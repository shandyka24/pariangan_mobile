package b4a.DesaWisataSumpu;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class httpjob extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.DesaWisataSumpu.httpjob");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.DesaWisataSumpu.httpjob.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _multipartfiledata{
public boolean IsInitialized;
public String Dir;
public String FileName;
public String KeyName;
public String ContentType;
public void Initialize() {
IsInitialized = true;
Dir = "";
FileName = "";
KeyName = "";
ContentType = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public String _jobname = "";
public boolean _success = false;
public String _username = "";
public String _password = "";
public String _errormessage = "";
public Object _target = null;
public String _taskid = "";
public anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest _req = null;
public anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse _response = null;
public Object _tag = null;
public String _invalidurl = "";
public String _defaultscheme = "";
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
public b4a.DesaWisataSumpu.starter _starter = null;
public b4a.DesaWisataSumpu.httputils2service _httputils2service = null;
public b4a.DesaWisataSumpu.b4xcollections _b4xcollections = null;
public b4a.DesaWisataSumpu.xuiviewsutils _xuiviewsutils = null;
public String  _getstring(b4a.DesaWisataSumpu.httpjob __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "getstring", true))
	 {return ((String) Debug.delegate(ba, "getstring", null));}
RDebugUtils.currentLine=8781824;
 //BA.debugLineNum = 8781824;BA.debugLine="Public Sub GetString As String";
RDebugUtils.currentLine=8781825;
 //BA.debugLineNum = 8781825;BA.debugLine="Return GetString2(\"UTF8\")";
if (true) return __ref._getstring2 /*String*/ (null,"UTF8");
RDebugUtils.currentLine=8781826;
 //BA.debugLineNum = 8781826;BA.debugLine="End Sub";
return "";
}
public String  _release(b4a.DesaWisataSumpu.httpjob __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "release", true))
	 {return ((String) Debug.delegate(ba, "release", null));}
RDebugUtils.currentLine=8716288;
 //BA.debugLineNum = 8716288;BA.debugLine="Public Sub Release";
RDebugUtils.currentLine=8716290;
 //BA.debugLineNum = 8716290;BA.debugLine="File.Delete(HttpUtils2Service.TempFolder, taskId)";
__c.File.Delete(_httputils2service._tempfolder /*String*/ ,__ref._taskid /*String*/ );
RDebugUtils.currentLine=8716292;
 //BA.debugLineNum = 8716292;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.DesaWisataSumpu.httpjob __ref,anywheresoftware.b4a.BA _ba,String _name,Object _targetmodule) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_name,_targetmodule}));}
RDebugUtils.currentLine=7602176;
 //BA.debugLineNum = 7602176;BA.debugLine="Public Sub Initialize (Name As String, TargetModul";
RDebugUtils.currentLine=7602177;
 //BA.debugLineNum = 7602177;BA.debugLine="JobName = Name";
__ref._jobname /*String*/  = _name;
RDebugUtils.currentLine=7602178;
 //BA.debugLineNum = 7602178;BA.debugLine="target = TargetModule";
__ref._target /*Object*/  = _targetmodule;
RDebugUtils.currentLine=7602186;
 //BA.debugLineNum = 7602186;BA.debugLine="End Sub";
return "";
}
public String  _poststring(b4a.DesaWisataSumpu.httpjob __ref,String _link,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "poststring", true))
	 {return ((String) Debug.delegate(ba, "poststring", new Object[] {_link,_text}));}
RDebugUtils.currentLine=7733248;
 //BA.debugLineNum = 7733248;BA.debugLine="Public Sub PostString(Link As String, Text As Stri";
RDebugUtils.currentLine=7733249;
 //BA.debugLineNum = 7733249;BA.debugLine="PostBytes(Link, Text.GetBytes(\"UTF8\"))";
__ref._postbytes /*String*/ (null,_link,_text.getBytes("UTF8"));
RDebugUtils.currentLine=7733250;
 //BA.debugLineNum = 7733250;BA.debugLine="End Sub";
return "";
}
public String  _download(b4a.DesaWisataSumpu.httpjob __ref,String _link) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "download", true))
	 {return ((String) Debug.delegate(ba, "download", new Object[] {_link}));}
RDebugUtils.currentLine=8388608;
 //BA.debugLineNum = 8388608;BA.debugLine="Public Sub Download(Link As String)";
RDebugUtils.currentLine=8388609;
 //BA.debugLineNum = 8388609;BA.debugLine="Try";
try {RDebugUtils.currentLine=8388610;
 //BA.debugLineNum = 8388610;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=8388611;
 //BA.debugLineNum = 8388611;BA.debugLine="req.InitializeGet(Link)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeGet(_link);
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=8388613;
 //BA.debugLineNum = 8388613;BA.debugLine="Log($\"Invalid link: ${Link}\"$)";
__c.LogImpl("98388613",("Invalid link: "+__c.SmartStringFormatter("",(Object)(_link))+""),0);
RDebugUtils.currentLine=8388614;
 //BA.debugLineNum = 8388614;BA.debugLine="req.InitializeGet(InvalidURL)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeGet(__ref._invalidurl /*String*/ );
 };
RDebugUtils.currentLine=8388616;
 //BA.debugLineNum = 8388616;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=8388617;
 //BA.debugLineNum = 8388617;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper  _getbitmap(b4a.DesaWisataSumpu.httpjob __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "getbitmap", true))
	 {return ((anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) Debug.delegate(ba, "getbitmap", null));}
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _b = null;
RDebugUtils.currentLine=9043968;
 //BA.debugLineNum = 9043968;BA.debugLine="Public Sub GetBitmap As Bitmap";
RDebugUtils.currentLine=9043969;
 //BA.debugLineNum = 9043969;BA.debugLine="Dim b As Bitmap";
_b = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=9043970;
 //BA.debugLineNum = 9043970;BA.debugLine="b = LoadBitmap(HttpUtils2Service.TempFolder, task";
_b = __c.LoadBitmap(_httputils2service._tempfolder /*String*/ ,__ref._taskid /*String*/ );
RDebugUtils.currentLine=9043971;
 //BA.debugLineNum = 9043971;BA.debugLine="Return b";
if (true) return _b;
RDebugUtils.currentLine=9043972;
 //BA.debugLineNum = 9043972;BA.debugLine="End Sub";
return null;
}
public String  _complete(b4a.DesaWisataSumpu.httpjob __ref,int _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "complete", true))
	 {return ((String) Debug.delegate(ba, "complete", new Object[] {_id}));}
RDebugUtils.currentLine=8978432;
 //BA.debugLineNum = 8978432;BA.debugLine="Public Sub Complete (id As Int)";
RDebugUtils.currentLine=8978433;
 //BA.debugLineNum = 8978433;BA.debugLine="taskId = id";
__ref._taskid /*String*/  = BA.NumberToString(_id);
RDebugUtils.currentLine=8978434;
 //BA.debugLineNum = 8978434;BA.debugLine="CallSubDelayed2(target, \"JobDone\", Me)";
__c.CallSubDelayed2(ba,__ref._target /*Object*/ ,"JobDone",this);
RDebugUtils.currentLine=8978435;
 //BA.debugLineNum = 8978435;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest  _getrequest(b4a.DesaWisataSumpu.httpjob __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "getrequest", true))
	 {return ((anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest) Debug.delegate(ba, "getrequest", null));}
RDebugUtils.currentLine=8912896;
 //BA.debugLineNum = 8912896;BA.debugLine="Public Sub GetRequest As OkHttpRequest";
RDebugUtils.currentLine=8912897;
 //BA.debugLineNum = 8912897;BA.debugLine="Return req";
if (true) return __ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ;
RDebugUtils.currentLine=8912898;
 //BA.debugLineNum = 8912898;BA.debugLine="End Sub";
return null;
}
public String  _addscheme(b4a.DesaWisataSumpu.httpjob __ref,String _link) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "addscheme", true))
	 {return ((String) Debug.delegate(ba, "addscheme", new Object[] {_link}));}
RDebugUtils.currentLine=7667712;
 //BA.debugLineNum = 7667712;BA.debugLine="Private Sub AddScheme (Link As String) As String";
RDebugUtils.currentLine=7667713;
 //BA.debugLineNum = 7667713;BA.debugLine="If DefaultScheme = \"\" Or Link.Contains(\":\") Then";
if ((__ref._defaultscheme /*String*/ ).equals("") || _link.contains(":")) { 
if (true) return _link;};
RDebugUtils.currentLine=7667714;
 //BA.debugLineNum = 7667714;BA.debugLine="Return DefaultScheme & \"://\" & Link";
if (true) return __ref._defaultscheme /*String*/ +"://"+_link;
RDebugUtils.currentLine=7667715;
 //BA.debugLineNum = 7667715;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.DesaWisataSumpu.httpjob __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
RDebugUtils.currentLine=7536640;
 //BA.debugLineNum = 7536640;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=7536641;
 //BA.debugLineNum = 7536641;BA.debugLine="Public JobName As String";
_jobname = "";
RDebugUtils.currentLine=7536642;
 //BA.debugLineNum = 7536642;BA.debugLine="Public Success As Boolean";
_success = false;
RDebugUtils.currentLine=7536643;
 //BA.debugLineNum = 7536643;BA.debugLine="Public Username, Password As String";
_username = "";
_password = "";
RDebugUtils.currentLine=7536644;
 //BA.debugLineNum = 7536644;BA.debugLine="Public ErrorMessage As String";
_errormessage = "";
RDebugUtils.currentLine=7536645;
 //BA.debugLineNum = 7536645;BA.debugLine="Private target As Object";
_target = new Object();
RDebugUtils.currentLine=7536651;
 //BA.debugLineNum = 7536651;BA.debugLine="Private taskId As String";
_taskid = "";
RDebugUtils.currentLine=7536653;
 //BA.debugLineNum = 7536653;BA.debugLine="Private req As OkHttpRequest";
_req = new anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest();
RDebugUtils.currentLine=7536654;
 //BA.debugLineNum = 7536654;BA.debugLine="Public Response As OkHttpResponse";
_response = new anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse();
RDebugUtils.currentLine=7536663;
 //BA.debugLineNum = 7536663;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=7536664;
 //BA.debugLineNum = 7536664;BA.debugLine="Type MultipartFileData (Dir As String, FileName A";
;
RDebugUtils.currentLine=7536668;
 //BA.debugLineNum = 7536668;BA.debugLine="Private Const InvalidURL As String = \"https://inv";
_invalidurl = "https://invalid-url/";
RDebugUtils.currentLine=7536669;
 //BA.debugLineNum = 7536669;BA.debugLine="Public DefaultScheme As String = \"https\"";
_defaultscheme = "https";
RDebugUtils.currentLine=7536670;
 //BA.debugLineNum = 7536670;BA.debugLine="End Sub";
return "";
}
public String  _delete(b4a.DesaWisataSumpu.httpjob __ref,String _link) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "delete", true))
	 {return ((String) Debug.delegate(ba, "delete", new Object[] {_link}));}
RDebugUtils.currentLine=8585216;
 //BA.debugLineNum = 8585216;BA.debugLine="Public Sub Delete(Link As String)";
RDebugUtils.currentLine=8585217;
 //BA.debugLineNum = 8585217;BA.debugLine="Try";
try {RDebugUtils.currentLine=8585218;
 //BA.debugLineNum = 8585218;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=8585219;
 //BA.debugLineNum = 8585219;BA.debugLine="req.InitializeDelete(Link)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeDelete(_link);
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=8585221;
 //BA.debugLineNum = 8585221;BA.debugLine="Log($\"Invalid link: ${Link}\"$)";
__c.LogImpl("98585221",("Invalid link: "+__c.SmartStringFormatter("",(Object)(_link))+""),0);
RDebugUtils.currentLine=8585222;
 //BA.debugLineNum = 8585222;BA.debugLine="req.InitializeDelete(InvalidURL)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeDelete(__ref._invalidurl /*String*/ );
 };
RDebugUtils.currentLine=8585224;
 //BA.debugLineNum = 8585224;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=8585225;
 //BA.debugLineNum = 8585225;BA.debugLine="End Sub";
return "";
}
public String  _delete2(b4a.DesaWisataSumpu.httpjob __ref,String _link,String[] _parameters) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "delete2", true))
	 {return ((String) Debug.delegate(ba, "delete2", new Object[] {_link,_parameters}));}
RDebugUtils.currentLine=8650752;
 //BA.debugLineNum = 8650752;BA.debugLine="Public Sub Delete2(Link As String, Parameters() As";
RDebugUtils.currentLine=8650753;
 //BA.debugLineNum = 8650753;BA.debugLine="Try";
try {RDebugUtils.currentLine=8650754;
 //BA.debugLineNum = 8650754;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=8650755;
 //BA.debugLineNum = 8650755;BA.debugLine="req.InitializeDelete(escapeLink(Link, Parameters";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeDelete(__ref._escapelink /*String*/ (null,_link,_parameters));
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=8650757;
 //BA.debugLineNum = 8650757;BA.debugLine="Log($\"Invalid link: ${Link}\"$)";
__c.LogImpl("98650757",("Invalid link: "+__c.SmartStringFormatter("",(Object)(_link))+""),0);
RDebugUtils.currentLine=8650758;
 //BA.debugLineNum = 8650758;BA.debugLine="req.InitializeDelete(escapeLink(InvalidURL, Para";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeDelete(__ref._escapelink /*String*/ (null,__ref._invalidurl /*String*/ ,_parameters));
 };
RDebugUtils.currentLine=8650760;
 //BA.debugLineNum = 8650760;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=8650761;
 //BA.debugLineNum = 8650761;BA.debugLine="End Sub";
return "";
}
public String  _escapelink(b4a.DesaWisataSumpu.httpjob __ref,String _link,String[] _parameters) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "escapelink", true))
	 {return ((String) Debug.delegate(ba, "escapelink", new Object[] {_link,_parameters}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.objects.StringUtils _su = null;
int _i = 0;
RDebugUtils.currentLine=8519680;
 //BA.debugLineNum = 8519680;BA.debugLine="Private Sub escapeLink(Link As String, Parameters(";
RDebugUtils.currentLine=8519681;
 //BA.debugLineNum = 8519681;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=8519682;
 //BA.debugLineNum = 8519682;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=8519683;
 //BA.debugLineNum = 8519683;BA.debugLine="sb.Append(Link)";
_sb.Append(_link);
RDebugUtils.currentLine=8519684;
 //BA.debugLineNum = 8519684;BA.debugLine="If Parameters.Length > 0 Then sb.Append(\"?\")";
if (_parameters.length>0) { 
_sb.Append("?");};
RDebugUtils.currentLine=8519685;
 //BA.debugLineNum = 8519685;BA.debugLine="Dim su As StringUtils";
_su = new anywheresoftware.b4a.objects.StringUtils();
RDebugUtils.currentLine=8519686;
 //BA.debugLineNum = 8519686;BA.debugLine="For i = 0 To Parameters.Length - 1 Step 2";
{
final int step6 = 2;
final int limit6 = (int) (_parameters.length-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=8519687;
 //BA.debugLineNum = 8519687;BA.debugLine="If i > 0 Then sb.Append(\"&\")";
if (_i>0) { 
_sb.Append("&");};
RDebugUtils.currentLine=8519688;
 //BA.debugLineNum = 8519688;BA.debugLine="sb.Append(su.EncodeUrl(Parameters(i), \"UTF8\")).A";
_sb.Append(_su.EncodeUrl(_parameters[_i],"UTF8")).Append("=");
RDebugUtils.currentLine=8519689;
 //BA.debugLineNum = 8519689;BA.debugLine="sb.Append(su.EncodeUrl(Parameters(i + 1), \"UTF8\"";
_sb.Append(_su.EncodeUrl(_parameters[(int) (_i+1)],"UTF8"));
 }
};
RDebugUtils.currentLine=8519691;
 //BA.debugLineNum = 8519691;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=8519692;
 //BA.debugLineNum = 8519692;BA.debugLine="End Sub";
return "";
}
public String  _download2(b4a.DesaWisataSumpu.httpjob __ref,String _link,String[] _parameters) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "download2", true))
	 {return ((String) Debug.delegate(ba, "download2", new Object[] {_link,_parameters}));}
RDebugUtils.currentLine=8454144;
 //BA.debugLineNum = 8454144;BA.debugLine="Public Sub Download2(Link As String, Parameters()";
RDebugUtils.currentLine=8454145;
 //BA.debugLineNum = 8454145;BA.debugLine="Try";
try {RDebugUtils.currentLine=8454146;
 //BA.debugLineNum = 8454146;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=8454147;
 //BA.debugLineNum = 8454147;BA.debugLine="req.InitializeGet(escapeLink(Link, Parameters))";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeGet(__ref._escapelink /*String*/ (null,_link,_parameters));
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=8454149;
 //BA.debugLineNum = 8454149;BA.debugLine="Log($\"Invalid link: ${Link}\"$)";
__c.LogImpl("98454149",("Invalid link: "+__c.SmartStringFormatter("",(Object)(_link))+""),0);
RDebugUtils.currentLine=8454150;
 //BA.debugLineNum = 8454150;BA.debugLine="req.InitializeGet(escapeLink(InvalidURL, Paramet";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeGet(__ref._escapelink /*String*/ (null,__ref._invalidurl /*String*/ ,_parameters));
 };
RDebugUtils.currentLine=8454152;
 //BA.debugLineNum = 8454152;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=8454153;
 //BA.debugLineNum = 8454153;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper  _getbitmapresize(b4a.DesaWisataSumpu.httpjob __ref,int _width,int _height,boolean _keepaspectratio) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "getbitmapresize", true))
	 {return ((anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) Debug.delegate(ba, "getbitmapresize", new Object[] {_width,_height,_keepaspectratio}));}
RDebugUtils.currentLine=9175040;
 //BA.debugLineNum = 9175040;BA.debugLine="Public Sub GetBitmapResize(Width As Int, Height As";
RDebugUtils.currentLine=9175041;
 //BA.debugLineNum = 9175041;BA.debugLine="Return LoadBitmapResize(HttpUtils2Service.TempFol";
if (true) return __c.LoadBitmapResize(_httputils2service._tempfolder /*String*/ ,__ref._taskid /*String*/ ,_width,_height,_keepaspectratio);
RDebugUtils.currentLine=9175042;
 //BA.debugLineNum = 9175042;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper  _getbitmapsample(b4a.DesaWisataSumpu.httpjob __ref,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "getbitmapsample", true))
	 {return ((anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) Debug.delegate(ba, "getbitmapsample", new Object[] {_width,_height}));}
RDebugUtils.currentLine=9109504;
 //BA.debugLineNum = 9109504;BA.debugLine="Public Sub GetBitmapSample(Width As Int, Height As";
RDebugUtils.currentLine=9109505;
 //BA.debugLineNum = 9109505;BA.debugLine="Return LoadBitmapSample(HttpUtils2Service.TempFol";
if (true) return __c.LoadBitmapSample(_httputils2service._tempfolder /*String*/ ,__ref._taskid /*String*/ ,_width,_height);
RDebugUtils.currentLine=9109506;
 //BA.debugLineNum = 9109506;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.streams.File.InputStreamWrapper  _getinputstream(b4a.DesaWisataSumpu.httpjob __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "getinputstream", true))
	 {return ((anywheresoftware.b4a.objects.streams.File.InputStreamWrapper) Debug.delegate(ba, "getinputstream", null));}
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in = null;
RDebugUtils.currentLine=9240576;
 //BA.debugLineNum = 9240576;BA.debugLine="Public Sub GetInputStream As InputStream";
RDebugUtils.currentLine=9240577;
 //BA.debugLineNum = 9240577;BA.debugLine="Dim In As InputStream";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
RDebugUtils.currentLine=9240578;
 //BA.debugLineNum = 9240578;BA.debugLine="In = File.OpenInput(HttpUtils2Service.TempFolder,";
_in = __c.File.OpenInput(_httputils2service._tempfolder /*String*/ ,__ref._taskid /*String*/ );
RDebugUtils.currentLine=9240579;
 //BA.debugLineNum = 9240579;BA.debugLine="Return In";
if (true) return _in;
RDebugUtils.currentLine=9240580;
 //BA.debugLineNum = 9240580;BA.debugLine="End Sub";
return null;
}
public String  _getstring2(b4a.DesaWisataSumpu.httpjob __ref,String _encoding) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "getstring2", true))
	 {return ((String) Debug.delegate(ba, "getstring2", new Object[] {_encoding}));}
anywheresoftware.b4a.objects.streams.File.TextReaderWrapper _tr = null;
String _res = "";
RDebugUtils.currentLine=8847360;
 //BA.debugLineNum = 8847360;BA.debugLine="Public Sub GetString2(Encoding As String) As Strin";
RDebugUtils.currentLine=8847364;
 //BA.debugLineNum = 8847364;BA.debugLine="Dim tr As TextReader";
_tr = new anywheresoftware.b4a.objects.streams.File.TextReaderWrapper();
RDebugUtils.currentLine=8847365;
 //BA.debugLineNum = 8847365;BA.debugLine="tr.Initialize2(File.OpenInput(HttpUtils2Service.T";
_tr.Initialize2((java.io.InputStream)(__c.File.OpenInput(_httputils2service._tempfolder /*String*/ ,__ref._taskid /*String*/ ).getObject()),_encoding);
RDebugUtils.currentLine=8847366;
 //BA.debugLineNum = 8847366;BA.debugLine="Dim res As String = tr.ReadAll";
_res = _tr.ReadAll();
RDebugUtils.currentLine=8847367;
 //BA.debugLineNum = 8847367;BA.debugLine="tr.Close";
_tr.Close();
RDebugUtils.currentLine=8847368;
 //BA.debugLineNum = 8847368;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=8847370;
 //BA.debugLineNum = 8847370;BA.debugLine="End Sub";
return "";
}
public String  _head(b4a.DesaWisataSumpu.httpjob __ref,String _link) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "head", true))
	 {return ((String) Debug.delegate(ba, "head", new Object[] {_link}));}
RDebugUtils.currentLine=8126464;
 //BA.debugLineNum = 8126464;BA.debugLine="Public Sub Head(Link As String)";
RDebugUtils.currentLine=8126465;
 //BA.debugLineNum = 8126465;BA.debugLine="Try";
try {RDebugUtils.currentLine=8126466;
 //BA.debugLineNum = 8126466;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=8126467;
 //BA.debugLineNum = 8126467;BA.debugLine="req.InitializeHead(Link)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeHead(_link);
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=8126469;
 //BA.debugLineNum = 8126469;BA.debugLine="Log($\"Invalid link: ${Link}\"$)";
__c.LogImpl("98126469",("Invalid link: "+__c.SmartStringFormatter("",(Object)(_link))+""),0);
RDebugUtils.currentLine=8126470;
 //BA.debugLineNum = 8126470;BA.debugLine="req.InitializeHead(InvalidURL)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeHead(__ref._invalidurl /*String*/ );
 };
RDebugUtils.currentLine=8126472;
 //BA.debugLineNum = 8126472;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=8126473;
 //BA.debugLineNum = 8126473;BA.debugLine="End Sub";
return "";
}
public boolean  _multipartstartsection(b4a.DesaWisataSumpu.httpjob __ref,anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _stream,boolean _empty) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "multipartstartsection", true))
	 {return ((Boolean) Debug.delegate(ba, "multipartstartsection", new Object[] {_stream,_empty}));}
RDebugUtils.currentLine=8257536;
 //BA.debugLineNum = 8257536;BA.debugLine="Private Sub MultipartStartSection (stream As Outpu";
RDebugUtils.currentLine=8257537;
 //BA.debugLineNum = 8257537;BA.debugLine="If empty = False Then";
if (_empty==__c.False) { 
RDebugUtils.currentLine=8257538;
 //BA.debugLineNum = 8257538;BA.debugLine="stream.WriteBytes(Array As Byte(13, 10), 0, 2)";
_stream.WriteBytes(new byte[]{(byte) (13),(byte) (10)},(int) (0),(int) (2));
 }else {
RDebugUtils.currentLine=8257540;
 //BA.debugLineNum = 8257540;BA.debugLine="empty = False";
_empty = __c.False;
 };
RDebugUtils.currentLine=8257542;
 //BA.debugLineNum = 8257542;BA.debugLine="Return empty";
if (true) return _empty;
RDebugUtils.currentLine=8257543;
 //BA.debugLineNum = 8257543;BA.debugLine="End Sub";
return false;
}
public String  _patchbytes(b4a.DesaWisataSumpu.httpjob __ref,String _link,byte[] _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "patchbytes", true))
	 {return ((String) Debug.delegate(ba, "patchbytes", new Object[] {_link,_data}));}
RDebugUtils.currentLine=8060928;
 //BA.debugLineNum = 8060928;BA.debugLine="Public Sub PatchBytes(Link As String, Data() As By";
RDebugUtils.currentLine=8060929;
 //BA.debugLineNum = 8060929;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=8060937;
 //BA.debugLineNum = 8060937;BA.debugLine="Try";
try {RDebugUtils.currentLine=8060938;
 //BA.debugLineNum = 8060938;BA.debugLine="req.InitializePatch2(Link, Data)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializePatch2(_link,_data);
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=8060940;
 //BA.debugLineNum = 8060940;BA.debugLine="Log($\"Invalid link: ${Link}\"$)";
__c.LogImpl("98060940",("Invalid link: "+__c.SmartStringFormatter("",(Object)(_link))+""),0);
RDebugUtils.currentLine=8060941;
 //BA.debugLineNum = 8060941;BA.debugLine="req.InitializePatch2(InvalidURL, Data)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializePatch2(__ref._invalidurl /*String*/ ,_data);
 };
RDebugUtils.currentLine=8060945;
 //BA.debugLineNum = 8060945;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=8060946;
 //BA.debugLineNum = 8060946;BA.debugLine="End Sub";
return "";
}
public String  _patchstring(b4a.DesaWisataSumpu.httpjob __ref,String _link,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "patchstring", true))
	 {return ((String) Debug.delegate(ba, "patchstring", new Object[] {_link,_text}));}
RDebugUtils.currentLine=7995392;
 //BA.debugLineNum = 7995392;BA.debugLine="Public Sub PatchString(Link As String, Text As Str";
RDebugUtils.currentLine=7995393;
 //BA.debugLineNum = 7995393;BA.debugLine="PatchBytes(Link, Text.GetBytes(\"UTF8\"))";
__ref._patchbytes /*String*/ (null,_link,_text.getBytes("UTF8"));
RDebugUtils.currentLine=7995394;
 //BA.debugLineNum = 7995394;BA.debugLine="End Sub";
return "";
}
public String  _postbytes(b4a.DesaWisataSumpu.httpjob __ref,String _link,byte[] _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "postbytes", true))
	 {return ((String) Debug.delegate(ba, "postbytes", new Object[] {_link,_data}));}
RDebugUtils.currentLine=7798784;
 //BA.debugLineNum = 7798784;BA.debugLine="Public Sub PostBytes(Link As String, Data() As Byt";
RDebugUtils.currentLine=7798785;
 //BA.debugLineNum = 7798785;BA.debugLine="Try";
try {RDebugUtils.currentLine=7798786;
 //BA.debugLineNum = 7798786;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=7798787;
 //BA.debugLineNum = 7798787;BA.debugLine="req.InitializePost2(Link, Data)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializePost2(_link,_data);
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=7798789;
 //BA.debugLineNum = 7798789;BA.debugLine="Log($\"Invalid link: ${Link}\"$)";
__c.LogImpl("97798789",("Invalid link: "+__c.SmartStringFormatter("",(Object)(_link))+""),0);
RDebugUtils.currentLine=7798790;
 //BA.debugLineNum = 7798790;BA.debugLine="req.InitializePost2(InvalidURL, Data)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializePost2(__ref._invalidurl /*String*/ ,_data);
 };
RDebugUtils.currentLine=7798792;
 //BA.debugLineNum = 7798792;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=7798793;
 //BA.debugLineNum = 7798793;BA.debugLine="End Sub";
return "";
}
public String  _postfile(b4a.DesaWisataSumpu.httpjob __ref,String _link,String _dir,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "postfile", true))
	 {return ((String) Debug.delegate(ba, "postfile", new Object[] {_link,_dir,_filename}));}
int _length = 0;
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in = null;
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
RDebugUtils.currentLine=8323072;
 //BA.debugLineNum = 8323072;BA.debugLine="Public Sub PostFile(Link As String, Dir As String,";
RDebugUtils.currentLine=8323073;
 //BA.debugLineNum = 8323073;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=8323078;
 //BA.debugLineNum = 8323078;BA.debugLine="Dim length As Int";
_length = 0;
RDebugUtils.currentLine=8323079;
 //BA.debugLineNum = 8323079;BA.debugLine="If Dir = File.DirAssets Then";
if ((_dir).equals(__c.File.getDirAssets())) { 
RDebugUtils.currentLine=8323080;
 //BA.debugLineNum = 8323080;BA.debugLine="Log(\"Cannot send files from the assets folder.\")";
__c.LogImpl("98323080","Cannot send files from the assets folder.",0);
RDebugUtils.currentLine=8323081;
 //BA.debugLineNum = 8323081;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=8323083;
 //BA.debugLineNum = 8323083;BA.debugLine="length = File.Size(Dir, FileName)";
_length = (int) (__c.File.Size(_dir,_filename));
RDebugUtils.currentLine=8323084;
 //BA.debugLineNum = 8323084;BA.debugLine="Dim In As InputStream";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
RDebugUtils.currentLine=8323085;
 //BA.debugLineNum = 8323085;BA.debugLine="In = File.OpenInput(Dir, FileName)";
_in = __c.File.OpenInput(_dir,_filename);
RDebugUtils.currentLine=8323086;
 //BA.debugLineNum = 8323086;BA.debugLine="If length < 1000000 Then '1mb";
if (_length<1000000) { 
RDebugUtils.currentLine=8323089;
 //BA.debugLineNum = 8323089;BA.debugLine="Dim out As OutputStream";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=8323090;
 //BA.debugLineNum = 8323090;BA.debugLine="out.InitializeToBytesArray(length)";
_out.InitializeToBytesArray(_length);
RDebugUtils.currentLine=8323091;
 //BA.debugLineNum = 8323091;BA.debugLine="File.Copy2(In, out)";
__c.File.Copy2((java.io.InputStream)(_in.getObject()),(java.io.OutputStream)(_out.getObject()));
RDebugUtils.currentLine=8323092;
 //BA.debugLineNum = 8323092;BA.debugLine="PostBytes(Link, out.ToBytesArray)";
__ref._postbytes /*String*/ (null,_link,_out.ToBytesArray());
 }else {
RDebugUtils.currentLine=8323094;
 //BA.debugLineNum = 8323094;BA.debugLine="req.InitializePost(Link, In, length)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializePost(_link,(java.io.InputStream)(_in.getObject()),_length);
RDebugUtils.currentLine=8323095;
 //BA.debugLineNum = 8323095;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\",";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
 };
RDebugUtils.currentLine=8323098;
 //BA.debugLineNum = 8323098;BA.debugLine="End Sub";
return "";
}
public String  _postmultipart(b4a.DesaWisataSumpu.httpjob __ref,String _link,anywheresoftware.b4a.objects.collections.Map _namevalues,anywheresoftware.b4a.objects.collections.List _files) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "postmultipart", true))
	 {return ((String) Debug.delegate(ba, "postmultipart", new Object[] {_link,_namevalues,_files}));}
String _boundary = "";
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _stream = null;
byte[] _b = null;
String _eol = "";
boolean _empty = false;
String _key = "";
String _value = "";
String _s = "";
b4a.DesaWisataSumpu.httpjob._multipartfiledata _fd = null;
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in = null;
RDebugUtils.currentLine=8192000;
 //BA.debugLineNum = 8192000;BA.debugLine="Public Sub PostMultipart(Link As String, NameValue";
RDebugUtils.currentLine=8192001;
 //BA.debugLineNum = 8192001;BA.debugLine="Dim boundary As String = \"-----------------------";
_boundary = "---------------------------1461124740692";
RDebugUtils.currentLine=8192002;
 //BA.debugLineNum = 8192002;BA.debugLine="Dim stream As OutputStream";
_stream = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=8192003;
 //BA.debugLineNum = 8192003;BA.debugLine="stream.InitializeToBytesArray(0)";
_stream.InitializeToBytesArray((int) (0));
RDebugUtils.currentLine=8192004;
 //BA.debugLineNum = 8192004;BA.debugLine="Dim b() As Byte";
_b = new byte[(int) (0)];
;
RDebugUtils.currentLine=8192005;
 //BA.debugLineNum = 8192005;BA.debugLine="Dim eol As String = Chr(13) & Chr(10)";
_eol = BA.ObjectToString(__c.Chr((int) (13)))+BA.ObjectToString(__c.Chr((int) (10)));
RDebugUtils.currentLine=8192006;
 //BA.debugLineNum = 8192006;BA.debugLine="Dim empty As Boolean = True";
_empty = __c.True;
RDebugUtils.currentLine=8192007;
 //BA.debugLineNum = 8192007;BA.debugLine="If NameValues <> Null And NameValues.IsInitialize";
if (_namevalues!= null && _namevalues.IsInitialized()) { 
RDebugUtils.currentLine=8192008;
 //BA.debugLineNum = 8192008;BA.debugLine="For Each key As String In NameValues.Keys";
{
final anywheresoftware.b4a.BA.IterableList group8 = _namevalues.Keys();
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_key = BA.ObjectToString(group8.Get(index8));
RDebugUtils.currentLine=8192009;
 //BA.debugLineNum = 8192009;BA.debugLine="Dim value As String = NameValues.Get(key)";
_value = BA.ObjectToString(_namevalues.Get((Object)(_key)));
RDebugUtils.currentLine=8192010;
 //BA.debugLineNum = 8192010;BA.debugLine="empty = MultipartStartSection (stream, empty)";
_empty = __ref._multipartstartsection /*boolean*/ (null,_stream,_empty);
RDebugUtils.currentLine=8192011;
 //BA.debugLineNum = 8192011;BA.debugLine="Dim s As String = _ $\"--${boundary} Content-Dis";
_s = ("--"+__c.SmartStringFormatter("",(Object)(_boundary))+"\n"+"Content-Disposition: form-data; name=\""+__c.SmartStringFormatter("",(Object)(_key))+"\"\n"+"\n"+""+__c.SmartStringFormatter("",(Object)(_value))+"");
RDebugUtils.currentLine=8192016;
 //BA.debugLineNum = 8192016;BA.debugLine="b = s.Replace(CRLF, eol).GetBytes(\"UTF8\")";
_b = _s.replace(__c.CRLF,_eol).getBytes("UTF8");
RDebugUtils.currentLine=8192017;
 //BA.debugLineNum = 8192017;BA.debugLine="stream.WriteBytes(b, 0, b.Length)";
_stream.WriteBytes(_b,(int) (0),_b.length);
 }
};
 };
RDebugUtils.currentLine=8192020;
 //BA.debugLineNum = 8192020;BA.debugLine="If Files <> Null And Files.IsInitialized Then";
if (_files!= null && _files.IsInitialized()) { 
RDebugUtils.currentLine=8192021;
 //BA.debugLineNum = 8192021;BA.debugLine="For Each fd As MultipartFileData In Files";
{
final anywheresoftware.b4a.BA.IterableList group17 = _files;
final int groupLen17 = group17.getSize()
;int index17 = 0;
;
for (; index17 < groupLen17;index17++){
_fd = (b4a.DesaWisataSumpu.httpjob._multipartfiledata)(group17.Get(index17));
RDebugUtils.currentLine=8192022;
 //BA.debugLineNum = 8192022;BA.debugLine="empty = MultipartStartSection (stream, empty)";
_empty = __ref._multipartstartsection /*boolean*/ (null,_stream,_empty);
RDebugUtils.currentLine=8192023;
 //BA.debugLineNum = 8192023;BA.debugLine="Dim s As String = _ $\"--${boundary} Content-Dis";
_s = ("--"+__c.SmartStringFormatter("",(Object)(_boundary))+"\n"+"Content-Disposition: form-data; name=\""+__c.SmartStringFormatter("",(Object)(_fd.KeyName /*String*/ ))+"\"; filename=\""+__c.SmartStringFormatter("",(Object)(_fd.FileName /*String*/ ))+"\"\n"+"Content-Type: "+__c.SmartStringFormatter("",(Object)(_fd.ContentType /*String*/ ))+"\n"+"\n"+"");
RDebugUtils.currentLine=8192029;
 //BA.debugLineNum = 8192029;BA.debugLine="b = s.Replace(CRLF, eol).GetBytes(\"UTF8\")";
_b = _s.replace(__c.CRLF,_eol).getBytes("UTF8");
RDebugUtils.currentLine=8192030;
 //BA.debugLineNum = 8192030;BA.debugLine="stream.WriteBytes(b, 0, b.Length)";
_stream.WriteBytes(_b,(int) (0),_b.length);
RDebugUtils.currentLine=8192031;
 //BA.debugLineNum = 8192031;BA.debugLine="Dim in As InputStream = File.OpenInput(fd.Dir,";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
_in = __c.File.OpenInput(_fd.Dir /*String*/ ,_fd.FileName /*String*/ );
RDebugUtils.currentLine=8192032;
 //BA.debugLineNum = 8192032;BA.debugLine="File.Copy2(in, stream)";
__c.File.Copy2((java.io.InputStream)(_in.getObject()),(java.io.OutputStream)(_stream.getObject()));
 }
};
 };
RDebugUtils.currentLine=8192035;
 //BA.debugLineNum = 8192035;BA.debugLine="empty = MultipartStartSection (stream, empty)";
_empty = __ref._multipartstartsection /*boolean*/ (null,_stream,_empty);
RDebugUtils.currentLine=8192036;
 //BA.debugLineNum = 8192036;BA.debugLine="s = _ $\"--${boundary}-- \"$";
_s = ("--"+__c.SmartStringFormatter("",(Object)(_boundary))+"--\n"+"");
RDebugUtils.currentLine=8192039;
 //BA.debugLineNum = 8192039;BA.debugLine="b = s.Replace(CRLF, eol).GetBytes(\"UTF8\")";
_b = _s.replace(__c.CRLF,_eol).getBytes("UTF8");
RDebugUtils.currentLine=8192040;
 //BA.debugLineNum = 8192040;BA.debugLine="stream.WriteBytes(b, 0, b.Length)";
_stream.WriteBytes(_b,(int) (0),_b.length);
RDebugUtils.currentLine=8192041;
 //BA.debugLineNum = 8192041;BA.debugLine="PostBytes(Link, stream.ToBytesArray)";
__ref._postbytes /*String*/ (null,_link,_stream.ToBytesArray());
RDebugUtils.currentLine=8192042;
 //BA.debugLineNum = 8192042;BA.debugLine="req.SetContentType(\"multipart/form-data; boundary";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .SetContentType("multipart/form-data; boundary="+_boundary);
RDebugUtils.currentLine=8192043;
 //BA.debugLineNum = 8192043;BA.debugLine="req.SetContentEncoding(\"UTF8\")";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .SetContentEncoding("UTF8");
RDebugUtils.currentLine=8192044;
 //BA.debugLineNum = 8192044;BA.debugLine="End Sub";
return "";
}
public String  _putbytes(b4a.DesaWisataSumpu.httpjob __ref,String _link,byte[] _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "putbytes", true))
	 {return ((String) Debug.delegate(ba, "putbytes", new Object[] {_link,_data}));}
RDebugUtils.currentLine=7929856;
 //BA.debugLineNum = 7929856;BA.debugLine="Public Sub PutBytes(Link As String, Data() As Byte";
RDebugUtils.currentLine=7929857;
 //BA.debugLineNum = 7929857;BA.debugLine="Try";
try {RDebugUtils.currentLine=7929858;
 //BA.debugLineNum = 7929858;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=7929859;
 //BA.debugLineNum = 7929859;BA.debugLine="req.InitializePut2(Link, Data)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializePut2(_link,_data);
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=7929861;
 //BA.debugLineNum = 7929861;BA.debugLine="Log($\"Invalid link: ${Link}\"$)";
__c.LogImpl("97929861",("Invalid link: "+__c.SmartStringFormatter("",(Object)(_link))+""),0);
RDebugUtils.currentLine=7929862;
 //BA.debugLineNum = 7929862;BA.debugLine="req.InitializePut2(InvalidURL, Data)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializePut2(__ref._invalidurl /*String*/ ,_data);
 };
RDebugUtils.currentLine=7929864;
 //BA.debugLineNum = 7929864;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=7929865;
 //BA.debugLineNum = 7929865;BA.debugLine="End Sub";
return "";
}
public String  _putstring(b4a.DesaWisataSumpu.httpjob __ref,String _link,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "putstring", true))
	 {return ((String) Debug.delegate(ba, "putstring", new Object[] {_link,_text}));}
RDebugUtils.currentLine=7864320;
 //BA.debugLineNum = 7864320;BA.debugLine="Public Sub PutString(Link As String, Text As Strin";
RDebugUtils.currentLine=7864321;
 //BA.debugLineNum = 7864321;BA.debugLine="PutBytes(Link, Text.GetBytes(\"UTF8\"))";
__ref._putbytes /*String*/ (null,_link,_text.getBytes("UTF8"));
RDebugUtils.currentLine=7864322;
 //BA.debugLineNum = 7864322;BA.debugLine="End Sub";
return "";
}
}