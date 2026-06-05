package ig;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zzafm;
import com.google.firebase.auth.FirebaseAuth;
import org.json.JSONException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class g implements jg.h, jg.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8547a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f8548b;

    public /* synthetic */ g(FirebaseAuth firebaseAuth, int i10) {
        this.f8547a = i10;
        this.f8548b = firebaseAuth;
    }

    @Override // jg.s
    public final void a(zzafm zzafmVar, l lVar) throws JSONException {
        switch (this.f8547a) {
            case 0:
                com.google.android.gms.common.internal.e0.i(zzafmVar);
                com.google.android.gms.common.internal.e0.i(lVar);
                ((jg.d) lVar).f8872a = zzafmVar;
                FirebaseAuth.e(this.f8548b, lVar, zzafmVar, true, true);
                break;
            default:
                FirebaseAuth firebaseAuth = this.f8548b;
                firebaseAuth.getClass();
                FirebaseAuth.e(firebaseAuth, lVar, zzafmVar, true, true);
                break;
        }
    }

    @Override // jg.h
    public final void zza(Status status) {
        switch (this.f8547a) {
            case 0:
                int i10 = status.f3491a;
                if (i10 == 17011 || i10 == 17021 || i10 == 17005 || i10 == 17091) {
                    this.f8548b.c();
                    break;
                }
                break;
            default:
                int i11 = status.f3491a;
                if (i11 == 17011 || i11 == 17021 || i11 == 17005) {
                    this.f8548b.c();
                    break;
                }
                break;
        }
    }
}
