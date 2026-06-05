package w1;

import android.view.autofill.AutofillManager;
import pi.o;
import v2.f0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b extends fj.m implements ej.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f18166a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f18167b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, f0 f0Var) {
        super(4);
        this.f18166a = cVar;
        this.f18167b = f0Var;
    }

    @Override // ej.g
    public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        int iIntValue3 = ((Number) obj3).intValue();
        int iIntValue4 = ((Number) obj4).intValue();
        c cVar = this.f18166a;
        cVar.f18173f.set(iIntValue, iIntValue2, iIntValue3, iIntValue4);
        yh.c cVar2 = cVar.f18168a;
        ((AutofillManager) cVar2.f20314b).requestAutofill(cVar.f18170c, this.f18167b.f17624b, cVar.f18173f);
        return o.f13011a;
    }
}
