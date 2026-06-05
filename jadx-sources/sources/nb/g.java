package nb;

import com.android.billingclient.api.Purchase;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import java.util.HashMap;
import java.util.concurrent.Executor;
import org.json.JSONObject;
import tj.r0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11998a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Purchase f11999b;

    public /* synthetic */ g(Purchase purchase, int i10) {
        this.f11998a = i10;
        this.f11999b = purchase;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        String str;
        int i10 = this.f11998a;
        pi.o oVar = pi.o.f13011a;
        Purchase purchase = this.f11999b;
        int i11 = 1;
        switch (i10) {
            case 0:
                String str2 = ((IntegrityTokenResponse) obj).token();
                fj.l.e(str2, "token(...)");
                int iOrdinal = o.A.ordinal();
                if (iOrdinal == 0) {
                    str = "monthly";
                } else if (iOrdinal == 1) {
                    str = "yearly";
                } else {
                    if (iOrdinal != 2) {
                        throw new b3.e();
                    }
                    str = "dev-test";
                }
                JSONObject jSONObject = purchase.f3403c;
                pi.h[] hVarArr = {new pi.h("purchaseToken", jSONObject.optString("token", jSONObject.optString("purchaseToken"))), new pi.h("subscriptionId", "void_launcher_pro"), new pi.h("basePlanId", str), new pi.h("integrityToken", str2), new pi.h("cloudProjectNumber", "738896392656")};
                HashMap map = new HashMap(qi.v.g0(5));
                qi.v.k0(map, hVarArr);
                jh.c cVar = o.f12030e;
                cVar.getClass();
                jh.h hVar = new jh.h();
                hVar.f8955a = jh.h.f8954b;
                Task task = jh.c.f8933h.getTask();
                Executor executor = cVar.f8938d;
                task.continueWithTask(executor, new ac.h(13, cVar, hVar)).continueWithTask(executor, new ai.n(cVar, map, hVar, 5)).addOnSuccessListener(new ac.h(new g(purchase, i11), 17)).addOnFailureListener(new l7.n(8));
                return oVar;
            default:
                o oVar2 = o.f12026a;
                JSONObject jSONObject2 = purchase.f3403c;
                if (!jSONObject2.optBoolean("acknowledged", true)) {
                    String strOptString = jSONObject2.optString("token", jSONObject2.optString("purchaseToken"));
                    if (strOptString == null) {
                        throw new IllegalArgumentException("Purchase token must be set");
                    }
                    rc.f fVar = new rc.f();
                    fVar.f14339a = strOptString;
                    w8.a aVar = o.f12050z;
                    if (aVar != null) {
                        aVar.a(fVar, new l7.n(9));
                    }
                }
                o.g();
                r0 r0Var = o.f12042r;
                x xVar = x.f12087b;
                r0Var.getClass();
                r0Var.k(null, xVar);
                return oVar;
        }
    }
}
