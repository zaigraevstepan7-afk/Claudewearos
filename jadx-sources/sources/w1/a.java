package w1;

import android.graphics.Rect;
import android.view.autofill.AutofillManager;
import pi.o;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a extends fj.m implements ej.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f18164a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18165b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, int i10) {
        super(4);
        this.f18164a = cVar;
        this.f18165b = i10;
    }

    @Override // ej.g
    public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        int iIntValue3 = ((Number) obj3).intValue();
        int iIntValue4 = ((Number) obj4).intValue();
        c cVar = this.f18164a;
        yh.c cVar2 = cVar.f18168a;
        ((AutofillManager) cVar2.f20314b).notifyViewEntered(cVar.f18170c, this.f18165b, new Rect(iIntValue, iIntValue2, iIntValue3, iIntValue4));
        return o.f13011a;
    }
}
