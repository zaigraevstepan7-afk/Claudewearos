package i5;

import a5.d;
import fj.l;
import y.n;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8345a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f8346b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f8347c;

    public /* synthetic */ b(c cVar, d dVar, int i10) {
        this.f8345a = i10;
        this.f8346b = cVar;
        this.f8347c = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8345a) {
            case 0:
                c cVar = this.f8346b;
                l.f(cVar, "this$0");
                d dVar = this.f8347c;
                l.f(dVar, "$e");
                ((n) cVar.f()).b(dVar);
                break;
            default:
                c cVar2 = this.f8346b;
                l.f(cVar2, "this$0");
                d dVar2 = this.f8347c;
                l.f(dVar2, "$e");
                ((n) cVar2.f()).b(dVar2);
                break;
        }
    }
}
