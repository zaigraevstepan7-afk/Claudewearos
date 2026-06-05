package pg;

import java.util.Map;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class f implements k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f12893a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f12894b;

    public f(q qVar, boolean z2) {
        this.f12894b = qVar;
        this.f12893a = z2;
    }

    @Override // pg.k
    public final void a(Map map) {
        q qVar = this.f12894b;
        p1.l lVar = qVar.f12948y;
        String str = (String) map.get("s");
        if (str.equals("ok")) {
            qVar.f12932h = l.f12910e;
            qVar.C = 0;
            qVar.i(this.f12893a);
            return;
        }
        qVar.f12940q = null;
        qVar.f12941r = true;
        rg.k kVar = qVar.f12925a;
        kVar.getClass();
        kVar.l(rg.c.f14386c, Boolean.FALSE);
        lVar.l(null, m1.k("Authentication failed: ", str, " (", (String) map.get("d"), ")"), new Object[0]);
        qVar.f12931g.a(2);
        if (str.equals("invalid_token")) {
            int i10 = qVar.C + 1;
            qVar.C = i10;
            if (i10 >= 3) {
                qg.a aVar = qVar.f12949z;
                aVar.f13488i = aVar.f13483d;
                lVar.J("Provided authentication credentials are invalid. This usually indicates your FirebaseApp instance was not initialized correctly. Make sure your google-services.json file has the correct firebase_url and api_key. You can re-download google-services.json from https://console.firebase.google.com/.");
            }
        }
    }
}
