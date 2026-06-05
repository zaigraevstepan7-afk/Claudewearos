package e5;

import a2.d0;
import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import fj.m;
import java.util.concurrent.Executor;
import pi.o;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d extends m implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CancellationSignal f5789a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Executor f5790b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z4.d f5791c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CancellationSignal cancellationSignal, Executor executor, z4.d dVar) {
        super(1);
        this.f5789a = cancellationSignal;
        this.f5790b = executor;
        this.f5791c = dVar;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        c cVar = CredentialProviderPlayServicesImpl.Companion;
        d0 d0Var = new d0(2, this.f5790b, this.f5791c);
        cVar.getClass();
        if (!c.a(this.f5789a)) {
            d0Var.a();
        }
        return o.f13011a;
    }
}
