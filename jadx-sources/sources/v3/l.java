package v3;

import v2.f0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l extends fj.m implements ej.e {
    public static final l A;

    /* renamed from: b, reason: collision with root package name */
    public static final l f17842b;

    /* renamed from: c, reason: collision with root package name */
    public static final l f17843c;

    /* renamed from: d, reason: collision with root package name */
    public static final l f17844d;

    /* renamed from: e, reason: collision with root package name */
    public static final l f17845e;

    /* renamed from: f, reason: collision with root package name */
    public static final l f17846f;

    /* renamed from: z, reason: collision with root package name */
    public static final l f17847z;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17848a;

    static {
        int i10 = 2;
        f17842b = new l(i10, 0);
        f17843c = new l(i10, 1);
        f17844d = new l(i10, 2);
        f17845e = new l(i10, 3);
        f17846f = new l(i10, 4);
        f17847z = new l(i10, 5);
        A = new l(i10, 6);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i10, int i11) {
        super(i10);
        this.f17848a = i11;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        int i10;
        switch (this.f17848a) {
            case 0:
                j.e((f0) obj).setUpdateBlock((ej.c) obj2);
                return pi.o.f13011a;
            case 1:
                j.e((f0) obj).setReleaseBlock((ej.c) obj2);
                return pi.o.f13011a;
            case 2:
                j.e((f0) obj).setModifier((v1.o) obj2);
                return pi.o.f13011a;
            case 3:
                j.e((f0) obj).setDensity((s3.c) obj2);
                return pi.o.f13011a;
            case 4:
                j.e((f0) obj).setLifecycleOwner((androidx.lifecycle.t) obj2);
                return pi.o.f13011a;
            case 5:
                j.e((f0) obj).setSavedStateRegistryOwner((a7.f) obj2);
                return pi.o.f13011a;
            default:
                w wVarE = j.e((f0) obj);
                int iOrdinal = ((s3.m) obj2).ordinal();
                if (iOrdinal != 0) {
                    i10 = 1;
                    if (iOrdinal != 1) {
                        throw new b3.e();
                    }
                } else {
                    i10 = 0;
                }
                wVarE.setLayoutDirection(i10);
                return pi.o.f13011a;
        }
    }
}
