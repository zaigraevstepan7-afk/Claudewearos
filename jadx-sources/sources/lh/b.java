package lh;

import android.content.Context;
import cg.i;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;
import java.util.concurrent.Executor;
import kg.r;
import uf.p;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements kg.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10975a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f10976b;

    public /* synthetic */ b(r rVar, int i10) {
        this.f10975a = i10;
        this.f10976b = rVar;
    }

    @Override // kg.e
    public final Object f(p pVar) {
        switch (this.f10975a) {
            case 0:
                return new d((Context) pVar.a(Context.class), ((i) pVar.a(i.class)).g(), pVar.g(r.a(e.class)), pVar.b(yh.b.class), (Executor) pVar.f(this.f10976b));
            case 1:
                return FirebaseMessagingRegistrar.lambda$getComponents$0(this.f10976b, pVar);
            default:
                return RemoteConfigRegistrar.lambda$getComponents$0(this.f10976b, pVar);
        }
    }
}
