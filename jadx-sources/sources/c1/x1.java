package c1;

import android.graphics.Bitmap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class x1 implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2847a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f2848b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2849c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2850d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2851e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2852f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f2853z;

    public /* synthetic */ x1(int i10, w1 w1Var, c2.w0 w0Var, ej.a aVar, v1.o oVar, boolean z2) {
        this.f2851e = oVar;
        this.f2849c = aVar;
        this.f2848b = z2;
        this.f2852f = w0Var;
        this.f2853z = w1Var;
        this.f2850d = i10;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2847a) {
            case 0:
                v1.o oVar = (v1.o) this.f2851e;
                ej.a aVar = (ej.a) this.f2849c;
                c2.w0 w0Var = (c2.w0) this.f2852f;
                ((Integer) obj2).getClass();
                z4.g(f1.s.O(this.f2850d | 1), (w1) this.f2853z, w0Var, aVar, (f1.i0) obj, oVar, this.f2848b);
                break;
            case 1:
                ((Integer) obj2).getClass();
                lb.q3.g((String) this.f2851e, (String) this.f2852f, (Bitmap) this.f2853z, this.f2848b, (ej.a) this.f2849c, (f1.i0) obj, f1.s.O(this.f2850d | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                sa.p.c((List) this.f2849c, (Map) this.f2852f, (v1.o) this.f2851e, this.f2848b, (ej.c) this.f2853z, (f1.i0) obj, f1.s.O(this.f2850d | 1));
                break;
        }
        return pi.o.f13011a;
    }

    public /* synthetic */ x1(String str, String str2, Bitmap bitmap, boolean z2, ej.a aVar, int i10) {
        this.f2851e = str;
        this.f2852f = str2;
        this.f2853z = bitmap;
        this.f2848b = z2;
        this.f2849c = aVar;
        this.f2850d = i10;
    }

    public /* synthetic */ x1(List list, Map map, v1.o oVar, boolean z2, ej.c cVar, int i10) {
        this.f2849c = list;
        this.f2852f = map;
        this.f2851e = oVar;
        this.f2848b = z2;
        this.f2853z = cVar;
        this.f2850d = i10;
    }
}
