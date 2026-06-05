package d0;

import f0.j0;
import f1.g1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4424a;

    /* renamed from: b, reason: collision with root package name */
    public final g1 f4425b;

    /* renamed from: c, reason: collision with root package name */
    public final g1 f4426c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4427d;

    /* renamed from: e, reason: collision with root package name */
    public Object f4428e;

    /* renamed from: f, reason: collision with root package name */
    public final j0 f4429f;

    public q(int i10, int i11, int i12) {
        this.f4424a = i12;
        switch (i12) {
            case 1:
                this.f4425b = new g1(i10);
                this.f4426c = new g1(i11);
                this.f4429f = new j0(i10, 90, 200);
                break;
            default:
                this.f4425b = new g1(i10);
                this.f4426c = new g1(i11);
                this.f4429f = new j0(i10, 30, 100);
                break;
        }
    }

    public final void a(int i10, int i11) {
        switch (this.f4424a) {
            case 0:
                if (i10 < 0.0f) {
                    a0.a.a("Index should be non-negative (" + i10 + ')');
                }
                this.f4425b.h(i10);
                this.f4429f.b(i10);
                this.f4426c.h(i11);
                break;
            default:
                if (i10 < 0.0f) {
                    a0.a.a("Index should be non-negative");
                }
                this.f4425b.h(i10);
                this.f4429f.b(i10);
                this.f4426c.h(i11);
                break;
        }
    }
}
