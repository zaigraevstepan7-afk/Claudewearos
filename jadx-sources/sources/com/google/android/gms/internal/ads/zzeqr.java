package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import java.util.concurrent.Callable;
import mc.n;
import nc.t;
import qc.r0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzeqr implements zzetu {
    private final Context zza;
    private final zzgdm zzb;

    public zzeqr(Context context, zzgdm zzgdmVar) {
        this.zza = context;
        this.zzb = zzgdmVar;
    }

    public static zzeqp zzc(zzeqr zzeqrVar) {
        Bundle bundle;
        n nVar = n.D;
        r0 r0Var = nVar.f11577c;
        zzbct zzbctVar = zzbdc.zzgj;
        t tVar = t.f12227d;
        String string = !((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue() ? "" : zzeqrVar.zza.getSharedPreferences("mobileads_consent", 0).getString("consent_string", "");
        String string2 = ((Boolean) tVar.f12230c.zzb(zzbdc.zzgl)).booleanValue() ? zzeqrVar.zza.getSharedPreferences("mobileads_consent", 0).getString("fc_consent", "") : "";
        r0 r0Var2 = nVar.f11577c;
        Context context = zzeqrVar.zza;
        if (((Boolean) tVar.f12230c.zzb(zzbdc.zzgk)).booleanValue()) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            bundle = new Bundle();
            if (defaultSharedPreferences.contains("IABConsent_CMPPresent")) {
                bundle.putBoolean("IABConsent_CMPPresent", defaultSharedPreferences.getBoolean("IABConsent_CMPPresent", false));
            }
            String[] strArr = {"IABConsent_SubjectToGDPR", "IABConsent_ConsentString", "IABConsent_ParsedPurposeConsents", "IABConsent_ParsedVendorConsents"};
            for (int i10 = 0; i10 < 4; i10++) {
                String str = strArr[i10];
                if (defaultSharedPreferences.contains(str)) {
                    bundle.putString(str, defaultSharedPreferences.getString(str, null));
                }
            }
        } else {
            bundle = null;
        }
        return new zzeqp(string, string2, bundle, null);
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return 18;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final mf.a zzb() {
        return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeqo
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeqr.zzc(this.zza);
            }
        });
    }
}
