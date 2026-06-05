package mc;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbuw;
import com.google.android.gms.internal.ads.zzbxy;
import java.util.Collections;
import java.util.List;
import qc.b0;
import qc.r0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f11536a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f11537b;

    /* renamed from: c, reason: collision with root package name */
    public final zzbxy f11538c;

    /* renamed from: d, reason: collision with root package name */
    public final zzbuw f11539d = new zzbuw(false, Collections.EMPTY_LIST);

    public b(Context context, zzbxy zzbxyVar) {
        this.f11536a = context;
        this.f11538c = zzbxyVar;
    }

    public final void a(String str) {
        List<String> list;
        zzbuw zzbuwVar = this.f11539d;
        zzbxy zzbxyVar = this.f11538c;
        if ((zzbxyVar == null || !zzbxyVar.zza().zzf) && !zzbuwVar.zza) {
            return;
        }
        if (str == null) {
            str = "";
        }
        if (zzbxyVar != null) {
            zzbxyVar.zze(str, null, 3);
            return;
        }
        if (!zzbuwVar.zza || (list = zzbuwVar.zzb) == null) {
            return;
        }
        for (String str2 : list) {
            if (!TextUtils.isEmpty(str2)) {
                String strReplace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                r0 r0Var = n.D.f11577c;
                new b0(this.f11536a, "", strReplace, null).zzb();
            }
        }
    }

    public final boolean b() {
        zzbxy zzbxyVar = this.f11538c;
        return ((zzbxyVar == null || !zzbxyVar.zza().zzf) && !this.f11539d.zza) || this.f11537b;
    }
}
