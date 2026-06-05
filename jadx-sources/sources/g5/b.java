package g5;

import fj.l;
import y.n;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7202a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f7203b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a5.d f7204c;

    public /* synthetic */ b(d dVar, a5.d dVar2, int i10) {
        this.f7202a = i10;
        this.f7203b = dVar;
        this.f7204c = dVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7202a) {
            case 0:
                d dVar = this.f7203b;
                l.f(dVar, "this$0");
                a5.d dVar2 = this.f7204c;
                l.f(dVar2, "$e");
                ((n) dVar.e()).b(dVar2);
                break;
            default:
                d dVar3 = this.f7203b;
                l.f(dVar3, "this$0");
                a5.d dVar4 = this.f7204c;
                l.f(dVar4, "$e");
                ((n) dVar3.e()).b(dVar4);
                break;
        }
    }
}
