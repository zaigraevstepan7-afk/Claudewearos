package ig;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzaak;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class d0 extends yd.f {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f8534h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l f8535i;
    public final /* synthetic */ d j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f8536k;

    public d0(FirebaseAuth firebaseAuth, boolean z2, l lVar, d dVar) {
        this.f8534h = z2;
        this.f8535i = lVar;
        this.j = dVar;
        this.f8536k = firebaseAuth;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [ig.g, jg.p] */
    @Override // yd.f
    public final Task p0(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.i("FirebaseAuth", "Email link login/reauth with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for login/reauth with email link");
        }
        boolean z2 = this.f8534h;
        d dVar = this.j;
        FirebaseAuth firebaseAuth = this.f8536k;
        if (!z2) {
            return firebaseAuth.f4256e.zza(firebaseAuth.f4252a, dVar, str, (jg.s) new f(firebaseAuth));
        }
        zzaak zzaakVar = firebaseAuth.f4256e;
        cg.i iVar = firebaseAuth.f4252a;
        l lVar = this.f8535i;
        com.google.android.gms.common.internal.e0.i(lVar);
        return zzaakVar.zzb(iVar, lVar, dVar, str, (jg.p) new g(firebaseAuth, 0));
    }
}
