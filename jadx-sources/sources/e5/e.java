package e5;

import android.util.Log;
import fj.l;
import fj.m;
import java.util.concurrent.Executor;
import pi.o;
import vf.j;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e extends m implements ej.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5792a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5793b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5794c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5795d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj, Object obj2, Object obj3, int i10) {
        super(0);
        this.f5792a = i10;
        this.f5795d = obj;
        this.f5793b = obj2;
        this.f5794c = obj3;
    }

    @Override // ej.a
    public final Object a() {
        switch (this.f5792a) {
            case 0:
                StringBuilder sb2 = new StringBuilder("During clear credential sign out failed with ");
                Exception exc = (Exception) this.f5795d;
                sb2.append(exc);
                Log.w("PlayServicesImpl", sb2.toString());
                ((Executor) this.f5793b).execute(new ac.e(2, (z4.d) this.f5794c, exc));
                break;
            case 1:
                ((Executor) this.f5793b).execute(new ac.e(3, (z4.d) this.f5794c, this.f5795d));
                break;
            default:
                w2.a aVar = (w2.a) this.f5795d;
                aVar.removeOnAttachStateChangeListener((c2.e) this.f5793b);
                j jVar = (j) this.f5794c;
                l.f(jVar, "listener");
                a.a.D(aVar).f8696a.remove(jVar);
                break;
        }
        return o.f13011a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Executor executor, z4.d dVar, Object obj) {
        super(0);
        this.f5792a = 1;
        this.f5793b = executor;
        this.f5794c = dVar;
        this.f5795d = obj;
    }
}
