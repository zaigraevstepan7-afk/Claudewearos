package xc;

import com.google.android.gms.internal.ads.zzbem;
import com.google.android.gms.internal.ads.zzbfh;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class y extends zc.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f20038a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f20039b;

    public y(a aVar, String str) {
        this.f20038a = str;
        this.f20039b = aVar;
    }

    @Override // zc.b
    public final void onFailure(String str) {
        int i10 = qc.l0.f13401b;
        rc.k.g("Failed to generate query info for the tagging library, error: ".concat(String.valueOf(str)));
        boolean zBooleanValue = ((Boolean) zzbfh.zzc.zze()).booleanValue();
        a aVar = this.f20039b;
        String strConcat = zBooleanValue ? ",\"as\":".concat(aVar.f19898k.a().toString()) : "";
        Locale locale = Locale.getDefault();
        zzbem zzbemVar = zzbfh.zze;
        String str2 = String.format(locale, "window.postMessage({\"paw_id\":\"%1$s\",\"error\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", this.f20038a, str, Long.valueOf(((Boolean) zzbemVar.zze()).booleanValue() ? ((Long) zzbfh.zzh.zze()).longValue() : 0L), strConcat);
        int i11 = 0;
        if (((Boolean) zzbemVar.zze()).booleanValue()) {
            try {
                aVar.f19896h.execute(new x(this, str2, i11));
            } catch (RuntimeException e10) {
                mc.n.D.f11582h.zzv(e10, "TaggingLibraryJsInterface.getQueryInfo.onFailure");
            }
        } else {
            aVar.f19890b.evaluateJavascript(str2, null);
        }
        if (((Boolean) zzbfh.zzc.zze()).booleanValue() && ((Boolean) zzbfh.zzd.zze()).booleanValue()) {
            e0 e0Var = aVar.f19899l;
            e0Var.getClass();
            e0Var.f19922c.execute(new d0(e0Var, i11));
        }
    }

    @Override // zc.b
    public final void onSuccess(zc.a aVar) throws JSONException {
        String str;
        String str2 = this.f20038a;
        a aVar2 = this.f20039b;
        b0 b0Var = aVar2.f19898k;
        String str3 = aVar.f20492a.f6649a;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("paw_id", str2);
            if (((Boolean) zzbfh.zzc.zze()).booleanValue()) {
                jSONObject.put("as", b0Var.a());
            }
            jSONObject.put("sdk_ttl_ms", ((Boolean) zzbfh.zze.zze()).booleanValue() ? ((Long) zzbfh.zzh.zze()).longValue() : 0L);
            jSONObject.put("signal", str3);
            str = String.format(Locale.getDefault(), "window.postMessage(%1$s, '*');", jSONObject);
        } catch (JSONException unused) {
            str = String.format(Locale.getDefault(), "window.postMessage({\"paw_id\":\"%1$s\",\"signal\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", str2, aVar.f20492a.f6649a, Long.valueOf(((Boolean) zzbfh.zze.zze()).booleanValue() ? ((Long) zzbfh.zzh.zze()).longValue() : 0L), ((Boolean) zzbfh.zzc.zze()).booleanValue() ? ",\"as\":".concat(b0Var.a().toString()) : "");
        }
        if (((Boolean) zzbfh.zze.zze()).booleanValue()) {
            try {
                aVar2.f19896h.execute(new x(this, str, 1));
            } catch (RuntimeException e10) {
                mc.n.D.f11582h.zzv(e10, "TaggingLibraryJsInterface.getQueryInfo.onSuccess");
            }
        } else {
            aVar2.f19890b.evaluateJavascript(str, null);
        }
        if (((Boolean) zzbfh.zzc.zze()).booleanValue() && ((Boolean) zzbfh.zzd.zze()).booleanValue()) {
            e0 e0Var = aVar2.f19899l;
            e0Var.getClass();
            e0Var.f19922c.execute(new d0(e0Var, 0));
        }
    }
}
