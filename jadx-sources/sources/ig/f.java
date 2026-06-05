package ig;

import com.google.android.gms.internal.p002firebaseauthapi.zzafm;
import com.google.firebase.auth.FirebaseAuth;
import org.json.JSONException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class f implements jg.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f8539a;

    public f(FirebaseAuth firebaseAuth) {
        this.f8539a = firebaseAuth;
    }

    @Override // jg.s
    public final void a(zzafm zzafmVar, l lVar) throws JSONException {
        com.google.android.gms.common.internal.e0.i(zzafmVar);
        com.google.android.gms.common.internal.e0.i(lVar);
        ((jg.d) lVar).f8872a = zzafmVar;
        FirebaseAuth.e(this.f8539a, lVar, zzafmVar, true, false);
    }
}
