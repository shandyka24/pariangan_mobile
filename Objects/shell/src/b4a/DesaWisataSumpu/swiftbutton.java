
package b4a.DesaWisataSumpu;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class swiftbutton {
    public static RemoteObject myClass;
	public swiftbutton() {
	}
    public static PCBA staticBA = new PCBA(null, swiftbutton.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mcallback = RemoteObject.declareNull("Object");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _cvs = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas");
public static RemoteObject _xlbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _clr1 = RemoteObject.createImmutable(0);
public static RemoteObject _clr2 = RemoteObject.createImmutable(0);
public static RemoteObject _disabledcolor = RemoteObject.createImmutable(0);
public static RemoteObject _pressed = RemoteObject.createImmutable(false);
public static RemoteObject _tag = RemoteObject.declareNull("Object");
public static RemoteObject _mdisabled = RemoteObject.createImmutable(false);
public static RemoteObject _cornersradius = RemoteObject.createImmutable(0);
public static RemoteObject _sideheight = RemoteObject.createImmutable(0);
public static RemoteObject _mhaptic = RemoteObject.createImmutable(false);
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.DesaWisataSumpu.main _main = null;
public static b4a.DesaWisataSumpu.core _core = null;
public static b4a.DesaWisataSumpu.detailev _detailev = null;
public static b4a.DesaWisataSumpu.detailrg _detailrg = null;
public static b4a.DesaWisataSumpu.homeuser _homeuser = null;
public static b4a.DesaWisataSumpu.homevisitor _homevisitor = null;
public static b4a.DesaWisataSumpu.listev _listev = null;
public static b4a.DesaWisataSumpu.listrg _listrg = null;
public static b4a.DesaWisataSumpu.mapsev _mapsev = null;
public static b4a.DesaWisataSumpu.mapsrg _mapsrg = null;
public static b4a.DesaWisataSumpu.starter _starter = null;
public static b4a.DesaWisataSumpu.httputils2service _httputils2service = null;
public static b4a.DesaWisataSumpu.b4xcollections _b4xcollections = null;
public static b4a.DesaWisataSumpu.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"clr1",_ref.getField(false, "_clr1"),"clr2",_ref.getField(false, "_clr2"),"CornersRadius",_ref.getField(false, "_cornersradius"),"cvs",_ref.getField(false, "_cvs"),"DateUtils",_ref.getField(false, "_dateutils"),"disabledColor",_ref.getField(false, "_disabledcolor"),"mBase",_ref.getField(false, "_mbase"),"mCallBack",_ref.getField(false, "_mcallback"),"mDisabled",_ref.getField(false, "_mdisabled"),"mEventName",_ref.getField(false, "_meventname"),"mHaptic",_ref.getField(false, "_mhaptic"),"pressed",_ref.getField(false, "_pressed"),"SideHeight",_ref.getField(false, "_sideheight"),"Tag",_ref.getField(false, "_tag"),"xLBL",_ref.getField(false, "_xlbl"),"xui",_ref.getField(false, "_xui")};
}
}