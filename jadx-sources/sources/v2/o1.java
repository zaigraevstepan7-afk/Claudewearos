package v2;

import java.util.Comparator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class o1 implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public static final o1 f17734b = new o1(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17735a;

    public /* synthetic */ o1(int i10) {
        this.f17735a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f17735a) {
            case 0:
                f0 f0Var = (f0) obj;
                f0 f0Var2 = (f0) obj2;
                int iH = fj.l.h(f0Var2.I, f0Var.I);
                return iH != 0 ? iH : fj.l.h(f0Var.hashCode(), f0Var2.hashCode());
            default:
                f0 f0Var3 = (f0) obj;
                f0 f0Var4 = (f0) obj2;
                int iH2 = fj.l.h(f0Var3.I, f0Var4.I);
                return iH2 != 0 ? iH2 : fj.l.h(f0Var3.hashCode(), f0Var4.hashCode());
        }
    }
}
