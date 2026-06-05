package ng;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import ig.m;
import java.util.concurrent.ScheduledExecutorService;
import rg.d;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements OnSuccessListener, OnFailureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q5.b f12340a;

    public /* synthetic */ b(q5.b bVar) {
        this.f12340a = bVar;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        boolean z2 = exc instanceof cg.c;
        q5.b bVar = this.f12340a;
        if (z2 || (exc instanceof uh.a)) {
            bVar.u(null);
        } else {
            ((ScheduledExecutorService) bVar.f13235b).execute(new d((pg.b) bVar.f13236c, exc.getMessage(), 1));
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        this.f12340a.u(((m) obj).f8554a);
    }
}
