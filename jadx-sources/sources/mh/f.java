package mh;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.iid.FirebaseInstanceId;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class f implements nh.a {

    /* renamed from: a, reason: collision with root package name */
    public final FirebaseInstanceId f11704a;

    public f(FirebaseInstanceId firebaseInstanceId) {
        this.f11704a = firebaseInstanceId;
    }

    public final Task a() {
        FirebaseInstanceId firebaseInstanceId = this.f11704a;
        String strF = firebaseInstanceId.f();
        if (strF != null) {
            return Tasks.forResult(strF);
        }
        cg.i iVar = firebaseInstanceId.f4280b;
        FirebaseInstanceId.c(iVar);
        return firebaseInstanceId.e(d.c(iVar)).continueWith(e.f11702d);
    }
}
