package b4a.DesaWisataSumpu;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xradiobutton extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.DesaWisataSumpu.b4xradiobutton");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.DesaWisataSumpu.b4xradiobutton.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public int _oncolor = 0;
public int _offcolor = 0;
public b4a.example.bitmapcreator _bc = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _iv = null;
public boolean _mvalue = false;
public b4a.example.bcpath._bcbrush _transparent = null;
public int _loopindex = 0;
public Object _tag = null;
public b4a.example.bcpath._bcbrush _onbrush = null;
public b4a.example.bcpath._bcbrush _offbrush = null;
public boolean _menabled = false;
public boolean _mhaptic = false;
public int _size = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper _mlabel = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _pnl = null;
public float _scale = 0f;
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
public String  _base_resize(b4a.DesaWisataSumpu.b4xradiobutton __ref,double _width1,double _height1) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xradiobutton";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width1,_height1}));}
int _newsize = 0;
int _gap = 0;
RDebugUtils.currentLine=31457280;
 //BA.debugLineNum = 31457280;BA.debugLine="Private Sub Base_Resize (Width1 As Double, Height1";
RDebugUtils.currentLine=31457281;
 //BA.debugLineNum = 31457281;BA.debugLine="Dim NewSize As Int = Max(5dip, Height1)";
_newsize = (int) (__c.Max(__c.DipToCurrent((int) (5)),_height1));
RDebugUtils.currentLine=31457282;
 //BA.debugLineNum = 31457282;BA.debugLine="If NewSize = Size Then Return";
if (_newsize==__ref._size /*int*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=31457283;
 //BA.debugLineNum = 31457283;BA.debugLine="Size = NewSize";
__ref._size /*int*/  = _newsize;
RDebugUtils.currentLine=31457284;
 //BA.debugLineNum = 31457284;BA.debugLine="Dim gap As Int = 3dip";
_gap = __c.DipToCurrent((int) (3));
RDebugUtils.currentLine=31457286;
 //BA.debugLineNum = 31457286;BA.debugLine="bc.Initialize(NewSize - 2 * gap, NewSize - 2 * ga";
__ref._bc /*b4a.example.bitmapcreator*/ ._initialize(ba,(int) (_newsize-2*_gap),(int) (_newsize-2*_gap));
RDebugUtils.currentLine=31457287;
 //BA.debugLineNum = 31457287;BA.debugLine="Scale = xui.Scale";
__ref._scale /*float*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getScale();
RDebugUtils.currentLine=31457292;
 //BA.debugLineNum = 31457292;BA.debugLine="iv.SetLayoutAnimated(0, gap, gap, Size - 2 * gap,";
__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_gap,_gap,(int) (__ref._size /*int*/ -2*_gap),(int) (__ref._size /*int*/ -2*_gap));
RDebugUtils.currentLine=31457293;
 //BA.debugLineNum = 31457293;BA.debugLine="pnl.SetLayoutAnimated(0, 0, 0, Width1, Height1)";
__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width1),(int) (_height1));
RDebugUtils.currentLine=31457294;
 //BA.debugLineNum = 31457294;BA.debugLine="mLabel.SetLayoutAnimated(0, Size + gap, 0, Width1";
__ref._mlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (__ref._size /*int*/ +_gap),(int) (0),(int) (_width1-__ref._size /*int*/ -_gap),(int) (_height1));
RDebugUtils.currentLine=31457295;
 //BA.debugLineNum = 31457295;BA.debugLine="OnBrush = bc.CreateBrushFromColor(OnColor)";
__ref._onbrush /*b4a.example.bcpath._bcbrush*/  = __ref._bc /*b4a.example.bitmapcreator*/ ._createbrushfromcolor(__ref._oncolor /*int*/ );
RDebugUtils.currentLine=31457296;
 //BA.debugLineNum = 31457296;BA.debugLine="OffBrush = bc.CreateBrushFromColor(OffColor)";
__ref._offbrush /*b4a.example.bcpath._bcbrush*/  = __ref._bc /*b4a.example.bitmapcreator*/ ._createbrushfromcolor(__ref._offcolor /*int*/ );
RDebugUtils.currentLine=31457297;
 //BA.debugLineNum = 31457297;BA.debugLine="transparent = bc.CreateBrushFromColor(xui.Color_T";
__ref._transparent /*b4a.example.bcpath._bcbrush*/  = __ref._bc /*b4a.example.bitmapcreator*/ ._createbrushfromcolor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=31457298;
 //BA.debugLineNum = 31457298;BA.debugLine="SetValueImpl(mValue, True)";
__ref._setvalueimpl /*void*/ (null,__ref._mvalue /*boolean*/ ,__c.True);
RDebugUtils.currentLine=31457299;
 //BA.debugLineNum = 31457299;BA.debugLine="End Sub";
return "";
}
public void  _setvalueimpl(b4a.DesaWisataSumpu.b4xradiobutton __ref,boolean _b,boolean _immediate) throws Exception{
RDebugUtils.currentModule="b4xradiobutton";
if (Debug.shouldDelegate(ba, "setvalueimpl", true))
	 {Debug.delegate(ba, "setvalueimpl", new Object[] {_b,_immediate}); return;}
ResumableSub_SetValueImpl rsub = new ResumableSub_SetValueImpl(this,__ref,_b,_immediate);
rsub.resume(ba, null);
}
public static class ResumableSub_SetValueImpl extends BA.ResumableSub {
public ResumableSub_SetValueImpl(b4a.DesaWisataSumpu.b4xradiobutton parent,b4a.DesaWisataSumpu.b4xradiobutton __ref,boolean _b,boolean _immediate) {
this.parent = parent;
this.__ref = __ref;
this._b = _b;
this._immediate = _immediate;
this.__ref = parent;
}
b4a.DesaWisataSumpu.b4xradiobutton __ref;
b4a.DesaWisataSumpu.b4xradiobutton parent;
boolean _b;
boolean _immediate;
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
b4a.DesaWisataSumpu.b4xradiobutton _rb = null;
int _myindex = 0;
long _start = 0L;
int _duration = 0;
float _state1 = 0f;
int step3;
int limit3;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xradiobutton";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=31588353;
 //BA.debugLineNum = 31588353;BA.debugLine="mValue = b";
__ref._mvalue /*boolean*/  = _b;
RDebugUtils.currentLine=31588354;
 //BA.debugLineNum = 31588354;BA.debugLine="If b = True Then";
if (true) break;

case 1:
//if
this.state = 12;
if (_b==parent.__c.True) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=31588355;
 //BA.debugLineNum = 31588355;BA.debugLine="For i = 0 To mBase.Parent.NumberOfViews - 1";
if (true) break;

case 4:
//for
this.state = 11;
step3 = 1;
limit3 = (int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent().getNumberOfViews()-1);
_i = (int) (0) ;
this.state = 59;
if (true) break;

case 59:
//C
this.state = 11;
if ((step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3)) this.state = 6;
if (true) break;

case 60:
//C
this.state = 59;
_i = ((int)(0 + _i + step3)) ;
if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=31588356;
 //BA.debugLineNum = 31588356;BA.debugLine="Dim v As B4XView = mBase.Parent.GetView(i)";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
_v = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent().GetView(_i);
RDebugUtils.currentLine=31588357;
 //BA.debugLineNum = 31588357;BA.debugLine="If v <> mBase And v.Tag Is B4XRadioButton Then";
if (true) break;

case 7:
//if
this.state = 10;
if ((_v).equals(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ) == false && _v.getTag() instanceof b4a.DesaWisataSumpu.b4xradiobutton) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=31588358;
 //BA.debugLineNum = 31588358;BA.debugLine="Dim rb As B4XRadioButton = v.Tag";
_rb = (b4a.DesaWisataSumpu.b4xradiobutton)(_v.getTag());
RDebugUtils.currentLine=31588359;
 //BA.debugLineNum = 31588359;BA.debugLine="rb.Checked = False";
_rb._setchecked /*boolean*/ (null,parent.__c.False);
 if (true) break;

case 10:
//C
this.state = 60;
;
 if (true) break;
if (true) break;

case 11:
//C
this.state = 12;
;
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=31588363;
 //BA.debugLineNum = 31588363;BA.debugLine="LoopIndex = LoopIndex + 1";
__ref._loopindex /*int*/  = (int) (__ref._loopindex /*int*/ +1);
RDebugUtils.currentLine=31588364;
 //BA.debugLineNum = 31588364;BA.debugLine="If Immediate Then";
if (true) break;

case 13:
//if
this.state = 53;
if (_immediate) { 
this.state = 15;
}else {
this.state = 25;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=31588365;
 //BA.debugLineNum = 31588365;BA.debugLine="If mValue Then Draw(1) Else Draw(0)";
if (true) break;

case 16:
//if
this.state = 23;
if (__ref._mvalue /*boolean*/ ) { 
this.state = 18;
;}
else {
this.state = 20;
;}if (true) break;

case 18:
//C
this.state = 23;
__ref._draw /*String*/ (null,(float) (1));
if (true) break;

case 20:
//C
this.state = 23;
__ref._draw /*String*/ (null,(float) (0));
if (true) break;

case 23:
//C
this.state = 53;
;
 if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=31588367;
 //BA.debugLineNum = 31588367;BA.debugLine="Dim MyIndex As Int = LoopIndex";
_myindex = __ref._loopindex /*int*/ ;
RDebugUtils.currentLine=31588368;
 //BA.debugLineNum = 31588368;BA.debugLine="Dim start As Long = DateTime.Now";
_start = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=31588369;
 //BA.debugLineNum = 31588369;BA.debugLine="Dim duration As Int = 200";
_duration = (int) (200);
RDebugUtils.currentLine=31588370;
 //BA.debugLineNum = 31588370;BA.debugLine="Do While DateTime.Now < start + duration";
if (true) break;

case 26:
//do while
this.state = 41;
while (parent.__c.DateTime.getNow()<_start+_duration) {
this.state = 28;
if (true) break;
}
if (true) break;

case 28:
//C
this.state = 29;
RDebugUtils.currentLine=31588371;
 //BA.debugLineNum = 31588371;BA.debugLine="Dim state1 As Float = (DateTime.Now - start) /";
_state1 = (float) ((parent.__c.DateTime.getNow()-_start)/(double)_duration);
RDebugUtils.currentLine=31588372;
 //BA.debugLineNum = 31588372;BA.debugLine="If mValue = False Then state1 = 1 - state1";
if (true) break;

case 29:
//if
this.state = 34;
if (__ref._mvalue /*boolean*/ ==parent.__c.False) { 
this.state = 31;
;}if (true) break;

case 31:
//C
this.state = 34;
_state1 = (float) (1-_state1);
if (true) break;

case 34:
//C
this.state = 35;
;
RDebugUtils.currentLine=31588373;
 //BA.debugLineNum = 31588373;BA.debugLine="Draw(state1)";
__ref._draw /*String*/ (null,_state1);
RDebugUtils.currentLine=31588374;
 //BA.debugLineNum = 31588374;BA.debugLine="Sleep(16)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xradiobutton", "setvalueimpl"),(int) (16));
this.state = 61;
return;
case 61:
//C
this.state = 35;
;
RDebugUtils.currentLine=31588375;
 //BA.debugLineNum = 31588375;BA.debugLine="If MyIndex <> LoopIndex Then Exit";
if (true) break;

case 35:
//if
this.state = 40;
if (_myindex!=__ref._loopindex /*int*/ ) { 
this.state = 37;
;}if (true) break;

case 37:
//C
this.state = 40;
this.state = 41;
if (true) break;
if (true) break;

case 40:
//C
this.state = 26;
;
 if (true) break;
;
RDebugUtils.currentLine=31588377;
 //BA.debugLineNum = 31588377;BA.debugLine="If MyIndex = LoopIndex Then";

case 41:
//if
this.state = 52;
if (_myindex==__ref._loopindex /*int*/ ) { 
this.state = 43;
}if (true) break;

case 43:
//C
this.state = 44;
RDebugUtils.currentLine=31588378;
 //BA.debugLineNum = 31588378;BA.debugLine="If mValue Then Draw(1) Else Draw(0)";
if (true) break;

case 44:
//if
this.state = 51;
if (__ref._mvalue /*boolean*/ ) { 
this.state = 46;
;}
else {
this.state = 48;
;}if (true) break;

case 46:
//C
this.state = 51;
__ref._draw /*String*/ (null,(float) (1));
if (true) break;

case 48:
//C
this.state = 51;
__ref._draw /*String*/ (null,(float) (0));
if (true) break;

case 51:
//C
this.state = 52;
;
 if (true) break;

case 52:
//C
this.state = 53;
;
 if (true) break;
;
RDebugUtils.currentLine=31588381;
 //BA.debugLineNum = 31588381;BA.debugLine="If mEnabled Then";

case 53:
//if
this.state = 58;
if (__ref._menabled /*boolean*/ ) { 
this.state = 55;
}else {
this.state = 57;
}if (true) break;

case 55:
//C
this.state = 58;
RDebugUtils.currentLine=31588382;
 //BA.debugLineNum = 31588382;BA.debugLine="XUIViewsUtils.SetAlpha(mBase, 1)";
parent._xuiviewsutils._setalpha /*String*/ (ba,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,(float) (1));
 if (true) break;

case 57:
//C
this.state = 58;
RDebugUtils.currentLine=31588384;
 //BA.debugLineNum = 31588384;BA.debugLine="XUIViewsUtils.SetAlpha(mBase, 0.4)";
parent._xuiviewsutils._setalpha /*String*/ (ba,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,(float) (0.4));
 if (true) break;

case 58:
//C
this.state = -1;
;
RDebugUtils.currentLine=31588387;
 //BA.debugLineNum = 31588387;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals(b4a.DesaWisataSumpu.b4xradiobutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xradiobutton";
RDebugUtils.currentLine=31260672;
 //BA.debugLineNum = 31260672;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=31260673;
 //BA.debugLineNum = 31260673;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=31260674;
 //BA.debugLineNum = 31260674;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=31260675;
 //BA.debugLineNum = 31260675;BA.debugLine="Public mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=31260676;
 //BA.debugLineNum = 31260676;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=31260677;
 //BA.debugLineNum = 31260677;BA.debugLine="Public OnColor, OffColor As Int";
_oncolor = 0;
_offcolor = 0;
RDebugUtils.currentLine=31260678;
 //BA.debugLineNum = 31260678;BA.debugLine="Private bc As BitmapCreator";
_bc = new b4a.example.bitmapcreator();
RDebugUtils.currentLine=31260679;
 //BA.debugLineNum = 31260679;BA.debugLine="Private iv As B4XView";
_iv = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=31260680;
 //BA.debugLineNum = 31260680;BA.debugLine="Private mValue As Boolean";
_mvalue = false;
RDebugUtils.currentLine=31260681;
 //BA.debugLineNum = 31260681;BA.debugLine="Private transparent As BCBrush";
_transparent = new b4a.example.bcpath._bcbrush();
RDebugUtils.currentLine=31260682;
 //BA.debugLineNum = 31260682;BA.debugLine="Private LoopIndex As Int";
_loopindex = 0;
RDebugUtils.currentLine=31260683;
 //BA.debugLineNum = 31260683;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=31260684;
 //BA.debugLineNum = 31260684;BA.debugLine="Private OnBrush, OffBrush As BCBrush";
_onbrush = new b4a.example.bcpath._bcbrush();
_offbrush = new b4a.example.bcpath._bcbrush();
RDebugUtils.currentLine=31260685;
 //BA.debugLineNum = 31260685;BA.debugLine="Private mEnabled As Boolean = True";
_menabled = __c.True;
RDebugUtils.currentLine=31260686;
 //BA.debugLineNum = 31260686;BA.debugLine="Public mHaptic As Boolean";
_mhaptic = false;
RDebugUtils.currentLine=31260687;
 //BA.debugLineNum = 31260687;BA.debugLine="Private Size As Int";
_size = 0;
RDebugUtils.currentLine=31260688;
 //BA.debugLineNum = 31260688;BA.debugLine="Public mLabel As B4XView";
_mlabel = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=31260689;
 //BA.debugLineNum = 31260689;BA.debugLine="Private pnl As B4XView";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=31260690;
 //BA.debugLineNum = 31260690;BA.debugLine="Private Scale As Float 'ignore";
_scale = 0f;
RDebugUtils.currentLine=31260691;
 //BA.debugLineNum = 31260691;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4a.DesaWisataSumpu.b4xradiobutton __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xradiobutton";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
anywheresoftware.b4a.objects.ImageViewWrapper _iiv = null;
RDebugUtils.currentLine=31391744;
 //BA.debugLineNum = 31391744;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=31391745;
 //BA.debugLineNum = 31391745;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=31391746;
 //BA.debugLineNum = 31391746;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=31391746;
 //BA.debugLineNum = 31391746;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=31391747;
 //BA.debugLineNum = 31391747;BA.debugLine="mBase.SetColorAndBorder(xui.Color_Transparent, 0,";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=31391748;
 //BA.debugLineNum = 31391748;BA.debugLine="pnl = xui.CreatePanel(\"pnl\")";
__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"pnl");
RDebugUtils.currentLine=31391749;
 //BA.debugLineNum = 31391749;BA.debugLine="pnl.Color = xui.Color_Transparent";
__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=31391750;
 //BA.debugLineNum = 31391750;BA.debugLine="Dim iiv As ImageView";
_iiv = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=31391751;
 //BA.debugLineNum = 31391751;BA.debugLine="iiv.Initialize(\"\")";
_iiv.Initialize(ba,"");
RDebugUtils.currentLine=31391752;
 //BA.debugLineNum = 31391752;BA.debugLine="iv = iiv";
__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iiv.getObject()));
RDebugUtils.currentLine=31391753;
 //BA.debugLineNum = 31391753;BA.debugLine="mBase.AddView(iv, 0, 0, 0, 0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=31391754;
 //BA.debugLineNum = 31391754;BA.debugLine="mLabel = Lbl";
__ref._mlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=31391755;
 //BA.debugLineNum = 31391755;BA.debugLine="mLabel.SetTextAlignment(\"CENTER\", \"LEFT\")";
__ref._mlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetTextAlignment("CENTER","LEFT");
RDebugUtils.currentLine=31391756;
 //BA.debugLineNum = 31391756;BA.debugLine="mBase.AddView(mLabel, 0, 0, 0, 0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._mlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=31391757;
 //BA.debugLineNum = 31391757;BA.debugLine="mBase.AddView(pnl, 0, 0, 0, 0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=31391759;
 //BA.debugLineNum = 31391759;BA.debugLine="OnColor = xui.PaintOrColorToColor(Props.Get(\"OnCo";
__ref._oncolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("OnColor")));
RDebugUtils.currentLine=31391760;
 //BA.debugLineNum = 31391760;BA.debugLine="OffColor = xui.PaintOrColorToColor(Props.Get(\"Off";
__ref._offcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("OffColor")));
RDebugUtils.currentLine=31391761;
 //BA.debugLineNum = 31391761;BA.debugLine="mHaptic = Props.GetDefault(\"HapticFeedback\", Fals";
__ref._mhaptic /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("HapticFeedback"),(Object)(__c.False)));
RDebugUtils.currentLine=31391763;
 //BA.debugLineNum = 31391763;BA.debugLine="mEnabled = mBase.Enabled";
__ref._menabled /*boolean*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getEnabled();
RDebugUtils.currentLine=31391764;
 //BA.debugLineNum = 31391764;BA.debugLine="mBase.Enabled = True";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=31391765;
 //BA.debugLineNum = 31391765;BA.debugLine="mValue = Props.Get(\"Value\")";
__ref._mvalue /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("Value")));
RDebugUtils.currentLine=31391766;
 //BA.debugLineNum = 31391766;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
__ref._base_resize /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=31391767;
 //BA.debugLineNum = 31391767;BA.debugLine="End Sub";
return "";
}
public String  _draw(b4a.DesaWisataSumpu.b4xradiobutton __ref,float _state) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xradiobutton";
if (Debug.shouldDelegate(ba, "draw", true))
	 {return ((String) Debug.delegate(ba, "draw", new Object[] {_state}));}
float _r = 0f;
RDebugUtils.currentLine=31916032;
 //BA.debugLineNum = 31916032;BA.debugLine="Private Sub Draw (State As Float)";
RDebugUtils.currentLine=31916033;
 //BA.debugLineNum = 31916033;BA.debugLine="bc.DrawRect2(bc.TargetRect, transparent, True, 0)";
__ref._bc /*b4a.example.bitmapcreator*/ ._drawrect2(__ref._bc /*b4a.example.bitmapcreator*/ ._targetrect,__ref._transparent /*b4a.example.bcpath._bcbrush*/ ,__c.True,(int) (0));
RDebugUtils.currentLine=31916034;
 //BA.debugLineNum = 31916034;BA.debugLine="Dim r As Float = Floor(bc.mHeight / 2)";
_r = (float) (__c.Floor(__ref._bc /*b4a.example.bitmapcreator*/ ._mheight/(double)2));
RDebugUtils.currentLine=31916035;
 //BA.debugLineNum = 31916035;BA.debugLine="If State < 1 Then bc.DrawCircle2(r, r, r, OffBrus";
if (_state<1) { 
__ref._bc /*b4a.example.bitmapcreator*/ ._drawcircle2(_r,_r,_r,__ref._offbrush /*b4a.example.bcpath._bcbrush*/ ,__c.True,(int) (0));};
RDebugUtils.currentLine=31916036;
 //BA.debugLineNum = 31916036;BA.debugLine="If State > 0 Then bc.DrawCircle2(r, r, r * State,";
if (_state>0) { 
__ref._bc /*b4a.example.bitmapcreator*/ ._drawcircle2(_r,_r,(float) (_r*_state),__ref._onbrush /*b4a.example.bcpath._bcbrush*/ ,__c.True,(int) (0));};
RDebugUtils.currentLine=31916037;
 //BA.debugLineNum = 31916037;BA.debugLine="bc.SetBitmapToImageView(bc.Bitmap, iv)";
__ref._bc /*b4a.example.bitmapcreator*/ ._setbitmaptoimageview(__ref._bc /*b4a.example.bitmapcreator*/ ._getbitmap(),__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=31916038;
 //BA.debugLineNum = 31916038;BA.debugLine="End Sub";
return "";
}
public boolean  _getchecked(b4a.DesaWisataSumpu.b4xradiobutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xradiobutton";
if (Debug.shouldDelegate(ba, "getchecked", true))
	 {return ((Boolean) Debug.delegate(ba, "getchecked", null));}
RDebugUtils.currentLine=31719424;
 //BA.debugLineNum = 31719424;BA.debugLine="Public Sub getChecked As Boolean";
RDebugUtils.currentLine=31719425;
 //BA.debugLineNum = 31719425;BA.debugLine="Return mValue";
if (true) return __ref._mvalue /*boolean*/ ;
RDebugUtils.currentLine=31719426;
 //BA.debugLineNum = 31719426;BA.debugLine="End Sub";
return false;
}
public boolean  _getenabled(b4a.DesaWisataSumpu.b4xradiobutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xradiobutton";
if (Debug.shouldDelegate(ba, "getenabled", true))
	 {return ((Boolean) Debug.delegate(ba, "getenabled", null));}
RDebugUtils.currentLine=31850496;
 //BA.debugLineNum = 31850496;BA.debugLine="Public Sub getEnabled As Boolean";
RDebugUtils.currentLine=31850497;
 //BA.debugLineNum = 31850497;BA.debugLine="Return mEnabled";
if (true) return __ref._menabled /*boolean*/ ;
RDebugUtils.currentLine=31850498;
 //BA.debugLineNum = 31850498;BA.debugLine="End Sub";
return false;
}
public Object  _gettext(b4a.DesaWisataSumpu.b4xradiobutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xradiobutton";
if (Debug.shouldDelegate(ba, "gettext", true))
	 {return ((Object) Debug.delegate(ba, "gettext", null));}
RDebugUtils.currentLine=32047104;
 //BA.debugLineNum = 32047104;BA.debugLine="Public Sub getText As Object";
RDebugUtils.currentLine=32047105;
 //BA.debugLineNum = 32047105;BA.debugLine="Return mLabel.Text";
if (true) return (Object)(__ref._mlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText());
RDebugUtils.currentLine=32047106;
 //BA.debugLineNum = 32047106;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4a.DesaWisataSumpu.b4xradiobutton __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xradiobutton";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=31326208;
 //BA.debugLineNum = 31326208;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=31326209;
 //BA.debugLineNum = 31326209;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=31326210;
 //BA.debugLineNum = 31326210;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=31326211;
 //BA.debugLineNum = 31326211;BA.debugLine="End Sub";
return "";
}
public String  _pnl_click(b4a.DesaWisataSumpu.b4xradiobutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xradiobutton";
if (Debug.shouldDelegate(ba, "pnl_click", true))
	 {return ((String) Debug.delegate(ba, "pnl_click", null));}
RDebugUtils.currentLine=31522816;
 //BA.debugLineNum = 31522816;BA.debugLine="Private Sub pnl_Click";
RDebugUtils.currentLine=31522818;
 //BA.debugLineNum = 31522818;BA.debugLine="If mValue Then Return";
if (__ref._mvalue /*boolean*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=31522819;
 //BA.debugLineNum = 31522819;BA.debugLine="If mEnabled Then";
if (__ref._menabled /*boolean*/ ) { 
RDebugUtils.currentLine=31522820;
 //BA.debugLineNum = 31522820;BA.debugLine="If mHaptic Then XUIViewsUtils.PerformHapticFeedb";
if (__ref._mhaptic /*boolean*/ ) { 
_xuiviewsutils._performhapticfeedback /*String*/ (ba,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );};
RDebugUtils.currentLine=31522821;
 //BA.debugLineNum = 31522821;BA.debugLine="SetValueImpl(Not(mValue), False)";
__ref._setvalueimpl /*void*/ (null,__c.Not(__ref._mvalue /*boolean*/ ),__c.False);
RDebugUtils.currentLine=31522822;
 //BA.debugLineNum = 31522822;BA.debugLine="If mValue And xui.SubExists(mCallBack, mEventNam";
if (__ref._mvalue /*boolean*/  && __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_Checked",(int) (0))) { 
RDebugUtils.currentLine=31522823;
 //BA.debugLineNum = 31522823;BA.debugLine="CallSubDelayed(mCallBack, mEventName & \"_Checke";
__c.CallSubDelayed(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_Checked");
 };
 };
RDebugUtils.currentLine=31522826;
 //BA.debugLineNum = 31522826;BA.debugLine="End Sub";
return "";
}
public String  _setchecked(b4a.DesaWisataSumpu.b4xradiobutton __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xradiobutton";
if (Debug.shouldDelegate(ba, "setchecked", true))
	 {return ((String) Debug.delegate(ba, "setchecked", new Object[] {_b}));}
RDebugUtils.currentLine=31653888;
 //BA.debugLineNum = 31653888;BA.debugLine="Public Sub setChecked(b As Boolean)";
RDebugUtils.currentLine=31653889;
 //BA.debugLineNum = 31653889;BA.debugLine="If b = mValue Then Return";
if (_b==__ref._mvalue /*boolean*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=31653890;
 //BA.debugLineNum = 31653890;BA.debugLine="SetValueImpl(b, False)";
__ref._setvalueimpl /*void*/ (null,_b,__c.False);
RDebugUtils.currentLine=31653891;
 //BA.debugLineNum = 31653891;BA.debugLine="End Sub";
return "";
}
public String  _setenabled(b4a.DesaWisataSumpu.b4xradiobutton __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xradiobutton";
if (Debug.shouldDelegate(ba, "setenabled", true))
	 {return ((String) Debug.delegate(ba, "setenabled", new Object[] {_b}));}
RDebugUtils.currentLine=31784960;
 //BA.debugLineNum = 31784960;BA.debugLine="Public Sub setEnabled (b As Boolean)";
RDebugUtils.currentLine=31784961;
 //BA.debugLineNum = 31784961;BA.debugLine="mEnabled = b";
__ref._menabled /*boolean*/  = _b;
RDebugUtils.currentLine=31784962;
 //BA.debugLineNum = 31784962;BA.debugLine="SetValueImpl(mValue, True)";
__ref._setvalueimpl /*void*/ (null,__ref._mvalue /*boolean*/ ,__c.True);
RDebugUtils.currentLine=31784963;
 //BA.debugLineNum = 31784963;BA.debugLine="End Sub";
return "";
}
public String  _settext(b4a.DesaWisataSumpu.b4xradiobutton __ref,Object _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xradiobutton";
if (Debug.shouldDelegate(ba, "settext", true))
	 {return ((String) Debug.delegate(ba, "settext", new Object[] {_t}));}
RDebugUtils.currentLine=31981568;
 //BA.debugLineNum = 31981568;BA.debugLine="Public Sub setText (t As Object)";
RDebugUtils.currentLine=31981569;
 //BA.debugLineNum = 31981569;BA.debugLine="XUIViewsUtils.SetTextOrCSBuilderToLabel(mLabel, t";
_xuiviewsutils._settextorcsbuildertolabel /*String*/ (ba,__ref._mlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,_t);
RDebugUtils.currentLine=31981570;
 //BA.debugLineNum = 31981570;BA.debugLine="End Sub";
return "";
}
}