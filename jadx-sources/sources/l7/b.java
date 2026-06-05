package l7;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b extends Property {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10015a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Class cls, String str, int i10) {
        super(cls, str);
        this.f10015a = i10;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f10015a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return Float.valueOf(x.f10082a.y((View) obj));
            default:
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f10015a) {
            case 0:
                e eVar = (e) obj;
                PointF pointF = (PointF) obj2;
                eVar.getClass();
                eVar.f10035a = Math.round(pointF.x);
                int iRound = Math.round(pointF.y);
                eVar.f10036b = iRound;
                int i10 = eVar.f10040f + 1;
                eVar.f10040f = i10;
                if (i10 == eVar.f10041g) {
                    x.a(eVar.f10039e, eVar.f10035a, iRound, eVar.f10037c, eVar.f10038d);
                    eVar.f10040f = 0;
                    eVar.f10041g = 0;
                    break;
                }
                break;
            case 1:
                e eVar2 = (e) obj;
                PointF pointF2 = (PointF) obj2;
                eVar2.getClass();
                eVar2.f10037c = Math.round(pointF2.x);
                int iRound2 = Math.round(pointF2.y);
                eVar2.f10038d = iRound2;
                int i11 = eVar2.f10041g + 1;
                eVar2.f10041g = i11;
                if (eVar2.f10040f == i11) {
                    x.a(eVar2.f10039e, eVar2.f10035a, eVar2.f10036b, eVar2.f10037c, iRound2);
                    eVar2.f10040f = 0;
                    eVar2.f10041g = 0;
                    break;
                }
                break;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                x.a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                x.a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                break;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int iRound3 = Math.round(pointF5.x);
                int iRound4 = Math.round(pointF5.y);
                x.a(view3, iRound3, iRound4, view3.getWidth() + iRound3, view3.getHeight() + iRound4);
                break;
            case 5:
                float fFloatValue = ((Float) obj2).floatValue();
                x.f10082a.M((View) obj, fFloatValue);
                break;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
        }
    }
}
