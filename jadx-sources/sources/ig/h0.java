package ig;

import com.google.firebase.auth.FirebaseAuth;
import java.util.Iterator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class h0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8551a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f8552b;

    public h0(FirebaseAuth firebaseAuth) {
        this.f8552b = firebaseAuth;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8551a) {
            case 0:
                FirebaseAuth firebaseAuth = this.f8552b;
                fj.l.f(firebaseAuth, "firebaseAuth");
                nb.o.f12031f.j(firebaseAuth.f4257f);
                nb.o.g();
                break;
            default:
                FirebaseAuth firebaseAuth2 = this.f8552b;
                Iterator it = firebaseAuth2.f4255d.iterator();
                while (it.hasNext()) {
                    ((nb.h) it.next()).getClass();
                    nb.o.f12031f.j(firebaseAuth2.f4257f);
                    nb.o.g();
                }
                break;
        }
    }

    public h0(FirebaseAuth firebaseAuth, nb.h hVar) {
        this.f8552b = firebaseAuth;
    }
}
