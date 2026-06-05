package ig;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class g0 extends yd.f {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l f8549h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d f8550i;
    public final /* synthetic */ jg.b j;

    public g0(jg.b bVar, l lVar, d dVar) {
        this.f8549h = lVar;
        this.f8550i = dVar;
        this.j = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [ig.g, jg.p] */
    @Override // yd.f
    public final Task p0(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.i("FirebaseAuth", "Linking email account with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for linking email account");
        }
        jg.b bVar = this.j;
        return bVar.f4256e.zza(bVar.f4252a, this.f8549h, (c) this.f8550i, str, (jg.p) new g(bVar, 0));
    }
}
