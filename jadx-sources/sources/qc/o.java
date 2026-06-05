package qc;

import android.content.Context;
import com.google.android.gms.internal.ads.zzapx;
import com.google.android.gms.internal.ads.zzaqb;
import com.google.android.gms.internal.ads.zzaqe;
import com.google.android.gms.internal.ads.zzaqk;
import com.google.android.gms.internal.ads.zzaqq;
import com.google.android.gms.internal.ads.zzaqx;
import com.google.android.gms.internal.ads.zzarc;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzbma;
import com.google.android.gms.internal.ads.zzfqj;
import com.google.android.gms.internal.ads.zzfqk;
import java.io.File;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class o extends zzaqq {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13413a;

    public o(Context context, zzarc zzarcVar) {
        super(zzarcVar);
        this.f13413a = context;
    }

    public static zzaqe a(Context context) {
        zzaqe zzaqeVar = new zzaqe(new zzaqx(new File(zzfqk.zza(zzfqj.zza(), context.getCacheDir(), "admob_volley")), 20971520), new o(context, new zzarc(null, null)), 4);
        zzaqeVar.zzd();
        return zzaqeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaqq, com.google.android.gms.internal.ads.zzapu
    public final zzapx zza(zzaqb zzaqbVar) throws zzaqk {
        if (zzaqbVar.zza() == 0) {
            if (Pattern.matches((String) nc.t.f12227d.f12230c.zzb(zzbdc.zzeF), zzaqbVar.zzk())) {
                rc.e eVar = nc.s.f12202f.f12203a;
                nd.f fVar = nd.f.f12280b;
                Context context = this.f13413a;
                if (fVar.d(context, 13400000) == 0) {
                    zzapx zzapxVarZza = new zzbma(context).zza(zzaqbVar);
                    if (zzapxVarZza != null) {
                        l0.k("Got gmscore asset response: ".concat(String.valueOf(zzaqbVar.zzk())));
                        return zzapxVarZza;
                    }
                    l0.k("Failed to get gmscore asset response: ".concat(String.valueOf(zzaqbVar.zzk())));
                }
            }
        }
        return super.zza(zzaqbVar);
    }
}
