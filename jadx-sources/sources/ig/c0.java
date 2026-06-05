package ig;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzaak;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class c0 extends yd.f {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f8524h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f8525i;
    public final /* synthetic */ l j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f8526k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f8527l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f8528m;

    public c0(FirebaseAuth firebaseAuth, String str, boolean z2, l lVar, String str2, String str3) {
        this.f8524h = str;
        this.f8525i = z2;
        this.j = lVar;
        this.f8526k = str2;
        this.f8527l = str3;
        this.f8528m = firebaseAuth;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [ig.g, jg.p] */
    @Override // yd.f
    public final Task p0(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        String str2 = this.f8524h;
        if (zIsEmpty) {
            Log.i("FirebaseAuth", "Logging in as " + str2 + " with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for login with email " + str2);
        }
        boolean z2 = this.f8525i;
        FirebaseAuth firebaseAuth = this.f8528m;
        if (!z2) {
            return firebaseAuth.f4256e.zzb(firebaseAuth.f4252a, this.f8524h, this.f8526k, this.f8527l, str, new f(firebaseAuth));
        }
        zzaak zzaakVar = firebaseAuth.f4256e;
        cg.i iVar = firebaseAuth.f4252a;
        l lVar = this.j;
        com.google.android.gms.common.internal.e0.i(lVar);
        return zzaakVar.zzb(iVar, lVar, this.f8524h, this.f8526k, this.f8527l, str, new g(firebaseAuth, 0));
    }
}
