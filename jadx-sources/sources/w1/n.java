package w1;

import android.view.ViewStructure;
import pi.o;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class n extends fj.m implements ej.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewStructure f18187a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ViewStructure viewStructure) {
        super(4);
        this.f18187a = viewStructure;
    }

    @Override // ej.g
    public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        int iIntValue3 = ((Number) obj3).intValue();
        int iIntValue4 = ((Number) obj4).intValue() - iIntValue2;
        this.f18187a.setDimens(iIntValue, iIntValue2, 0, 0, iIntValue3 - iIntValue, iIntValue4);
        return o.f13011a;
    }
}
