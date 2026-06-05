package d3;

import java.util.Comparator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public static final h f4716b = new h(0);

    /* renamed from: c, reason: collision with root package name */
    public static final h f4717c = new h(1);

    /* renamed from: d, reason: collision with root package name */
    public static final h f4718d = new h(2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4719a;

    public /* synthetic */ h(int i10) {
        this.f4719a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f4719a) {
            case 0:
                b2.c cVarH = ((r) obj).h();
                b2.c cVarH2 = ((r) obj2).h();
                int iCompare = Float.compare(cVarH.f1502a, cVarH2.f1502a);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompare2 = Float.compare(cVarH.f1503b, cVarH2.f1503b);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompare3 = Float.compare(cVarH.f1505d, cVarH2.f1505d);
                return iCompare3 != 0 ? iCompare3 : Float.compare(cVarH.f1504c, cVarH2.f1504c);
            case 1:
                b2.c cVarH3 = ((r) obj).h();
                b2.c cVarH4 = ((r) obj2).h();
                int iCompare4 = Float.compare(cVarH4.f1504c, cVarH3.f1504c);
                if (iCompare4 != 0) {
                    return iCompare4;
                }
                int iCompare5 = Float.compare(cVarH3.f1503b, cVarH4.f1503b);
                if (iCompare5 != 0) {
                    return iCompare5;
                }
                int iCompare6 = Float.compare(cVarH3.f1505d, cVarH4.f1505d);
                return iCompare6 != 0 ? iCompare6 : Float.compare(cVarH4.f1502a, cVarH3.f1502a);
            default:
                pi.h hVar = (pi.h) obj;
                pi.h hVar2 = (pi.h) obj2;
                int iCompare7 = Float.compare(((b2.c) hVar.f13000a).f1503b, ((b2.c) hVar2.f13000a).f1503b);
                return iCompare7 != 0 ? iCompare7 : Float.compare(((b2.c) hVar.f13000a).f1505d, ((b2.c) hVar2.f13000a).f1505d);
        }
    }
}
