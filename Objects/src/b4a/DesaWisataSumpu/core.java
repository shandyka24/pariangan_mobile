package b4a.DesaWisataSumpu;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class core {
private static core mostCurrent = new core();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 
public anywheresoftware.b4a.keywords.Common __c = null;
public b4a.example.dateutils _dateutils = null;
public b4a.DesaWisataSumpu.main _main = null;
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
public static String  _executeurl(anywheresoftware.b4a.BA _ba,String _url,String _parameters,String _jobname,Object _obj) throws Exception{
RDebugUtils.currentModule="core";
if (Debug.shouldDelegate(null, "executeurl", false))
	 {return ((String) Debug.delegate(null, "executeurl", new Object[] {_ba,_url,_parameters,_jobname,_obj}));}
b4a.DesaWisataSumpu.httpjob _job = null;
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Sub ExecuteUrl(Url As String, Parameters As String";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="Dim job As HttpJob";
_job = new b4a.DesaWisataSumpu.httpjob();
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="job.Initialize(JobName, Obj)";
_job._initialize /*String*/ (null,(_ba.processBA == null ? _ba : _ba.processBA),_jobname,_obj);
RDebugUtils.currentLine=655363;
 //BA.debugLineNum = 655363;BA.debugLine="job.PostString(Url, Parameters)";
_job._poststring /*String*/ (null,_url,_parameters);
RDebugUtils.currentLine=655364;
 //BA.debugLineNum = 655364;BA.debugLine="End Sub";
return "";
}
public static String  _executeurlget(anywheresoftware.b4a.BA _ba,String _url,String _jobname,Object _obj) throws Exception{
RDebugUtils.currentModule="core";
if (Debug.shouldDelegate(null, "executeurlget", false))
	 {return ((String) Debug.delegate(null, "executeurlget", new Object[] {_ba,_url,_jobname,_obj}));}
b4a.DesaWisataSumpu.httpjob _job = null;
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Sub ExecuteUrlGet(Url As String, JobName As String";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="Dim job As HttpJob";
_job = new b4a.DesaWisataSumpu.httpjob();
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="job.Initialize(JobName, Obj)";
_job._initialize /*String*/ (null,(_ba.processBA == null ? _ba : _ba.processBA),_jobname,_obj);
RDebugUtils.currentLine=720899;
 //BA.debugLineNum = 720899;BA.debugLine="job.Download(Url)";
_job._download /*String*/ (null,_url);
RDebugUtils.currentLine=720900;
 //BA.debugLineNum = 720900;BA.debugLine="End Sub";
return "";
}
}