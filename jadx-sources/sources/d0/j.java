package d0;

import f0.b0;
import f1.i0;
import f1.r1;
import java.time.LocalDateTime;
import java.util.List;
import lb.l0;
import t.j1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4363a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4364b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4365c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4366d;

    public /* synthetic */ j(int i10, b0 b0Var, Object obj) {
        this.f4363a = 2;
        this.f4366d = b0Var;
        this.f4364b = i10;
        this.f4365c = obj;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4363a) {
            case 0:
                ((Integer) obj2).getClass();
                ((k) this.f4366d).e(this.f4364b, this.f4365c, (i0) obj, f1.s.O(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((e0.h) this.f4366d).e(this.f4364b, this.f4365c, (i0) obj, f1.s.O(1));
                break;
            case 2:
                b0 b0Var = (b0) this.f4366d;
                i0 i0Var = (i0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (i0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    b0Var.e(this.f4364b, this.f4365c, i0Var, 0);
                } else {
                    i0Var.W();
                }
                return pi.o.f13011a;
            case 3:
                ((Integer) obj2).intValue();
                f1.s.a((r1) this.f4366d, (ej.e) this.f4365c, (i0) obj, f1.s.O(this.f4364b | 1));
                break;
            case 4:
                ((Integer) obj2).intValue();
                f1.s.b((r1[]) this.f4366d, (ej.e) this.f4365c, (i0) obj, f1.s.O(this.f4364b | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                ((g0.w) this.f4366d).e(this.f4364b, this.f4365c, (i0) obj, f1.s.O(1));
                break;
            case 6:
                ((Integer) obj2).intValue();
                k0.d.a((g3.f) this.f4366d, (List) this.f4365c, (i0) obj, f1.s.O(this.f4364b | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                l0.c((String) this.f4366d, (ej.a) this.f4365c, (i0) obj, f1.s.O(7), this.f4364b);
                break;
            case 8:
                ((Integer) obj2).intValue();
                ((p1.e) this.f4366d).f(this.f4365c, (i0) obj, f1.s.O(this.f4364b) | 1);
                break;
            case 9:
                ((Integer) obj2).getClass();
                ra.b.c((LocalDateTime) this.f4366d, (ej.a) this.f4365c, (i0) obj, f1.s.O(this.f4364b | 1));
                break;
            case 10:
                ((Integer) obj2).intValue();
                ((j1) this.f4366d).a(this.f4365c, (i0) obj, f1.s.O(this.f4364b | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                v.n.a((v1.o) this.f4366d, (ej.c) this.f4365c, (i0) obj, f1.s.O(this.f4364b | 1));
                break;
        }
        return pi.o.f13011a;
    }

    public /* synthetic */ j(b0 b0Var, int i10, Object obj, int i11, int i12) {
        this.f4363a = i12;
        this.f4366d = b0Var;
        this.f4364b = i10;
        this.f4365c = obj;
    }

    public /* synthetic */ j(Object obj, int i10, int i11, Object obj2) {
        this.f4363a = i11;
        this.f4366d = obj;
        this.f4365c = obj2;
        this.f4364b = i10;
    }

    public /* synthetic */ j(String str, ej.a aVar, int i10, int i11) {
        this.f4363a = 7;
        this.f4366d = str;
        this.f4365c = aVar;
        this.f4364b = i11;
    }

    public /* synthetic */ j(LocalDateTime localDateTime, ej.a aVar, int i10) {
        this.f4363a = 9;
        this.f4366d = localDateTime;
        this.f4365c = aVar;
        this.f4364b = i10;
    }
}
