package xc;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzdei;
import com.google.android.gms.internal.ads.zzdrw;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class m0 implements zzdei {

    /* renamed from: a, reason: collision with root package name */
    public final zzdrw f19988a;

    /* renamed from: b, reason: collision with root package name */
    public final l0 f19989b;

    /* renamed from: c, reason: collision with root package name */
    public final String f19990c;

    /* renamed from: d, reason: collision with root package name */
    public final int f19991d;

    public m0(zzdrw zzdrwVar, l0 l0Var, String str, int i10) {
        this.f19988a = zzdrwVar;
        this.f19989b = l0Var;
        this.f19990c = str;
        this.f19991d = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzdei
    public final void zze(v vVar) {
        String strOptString;
        if (vVar == null || this.f19991d == 2) {
            return;
        }
        boolean zIsEmpty = TextUtils.isEmpty(vVar.f20026c);
        zzdrw zzdrwVar = this.f19988a;
        l0 l0Var = this.f19989b;
        if (zIsEmpty) {
            l0Var.b(this.f19990c, vVar.f20025b, zzdrwVar);
            return;
        }
        try {
            strOptString = new JSONObject(vVar.f20026c).optString("request_id");
        } catch (JSONException e10) {
            mc.n.D.f11582h.zzw(e10, "RenderSignals.getRequestId");
            strOptString = null;
        }
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        l0Var.b(strOptString, vVar.f20026c, zzdrwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdei
    public final void zzf(String str) {
    }
}
