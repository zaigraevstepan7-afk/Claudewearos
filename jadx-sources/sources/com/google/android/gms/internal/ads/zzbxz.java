package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.io.IOException;
import java.util.Objects;
import mc.n;
import nc.t;
import qc.l0;
import qc.n0;
import qc.o0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbxz implements SharedPreferences.OnSharedPreferenceChangeListener {
    private final Context zza;
    private final SharedPreferences zzb;
    private final n0 zzc;
    private String zzd = "-1";
    private int zze = -1;

    public zzbxz(Context context, n0 n0Var) {
        this.zzb = PreferenceManager.getDefaultSharedPreferences(context);
        this.zzc = n0Var;
        this.zza = context;
    }

    private final void zzb() throws IOException {
        ((o0) this.zzc).c(true);
        cg.b.Z(this.zza);
    }

    private final void zzc(String str, int i10) {
        Context context;
        zzbct zzbctVar = zzbdc.zzaL;
        t tVar = t.f12227d;
        boolean z2 = true;
        if (!((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue() ? !(str.isEmpty() || str.charAt(0) != '1') : !(i10 == 0 || str.isEmpty() || (str.charAt(0) != '1' && !str.equals("-1")))) {
            z2 = false;
        }
        ((o0) this.zzc).c(z2);
        if (((Boolean) tVar.f12230c.zzb(zzbdc.zzgq)).booleanValue() && z2 && (context = this.zza) != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        try {
            zzbct zzbctVar = zzbdc.zzaN;
            t tVar = t.f12227d;
            if (((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue()) {
                if (Objects.equals(str, "gad_has_consent_for_cookies")) {
                    int i10 = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
                    n0 n0Var = this.zzc;
                    o0 o0Var = (o0) n0Var;
                    o0Var.l();
                    if (i10 != o0Var.f13425m) {
                        zzb();
                    }
                    ((o0) n0Var).a(i10);
                    return;
                }
                if (Objects.equals(str, "IABTCF_TCString")) {
                    String string = sharedPreferences.getString(str, "-1");
                    n0 n0Var2 = this.zzc;
                    o0 o0Var2 = (o0) n0Var2;
                    o0Var2.l();
                    if (!Objects.equals(string, o0Var2.f13424l)) {
                        zzb();
                    }
                    ((o0) n0Var2).h(string);
                    return;
                }
                return;
            }
            String string2 = sharedPreferences.getString("IABTCF_PurposeConsents", "-1");
            int i11 = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
            String strValueOf = String.valueOf(str);
            int iHashCode = strValueOf.hashCode();
            if (iHashCode == -2004976699) {
                if (!strValueOf.equals("IABTCF_PurposeConsents") || string2.equals("-1") || this.zzd.equals(string2)) {
                    return;
                }
                this.zzd = string2;
                zzc(string2, i11);
                return;
            }
            if (iHashCode == -527267622 && strValueOf.equals("gad_has_consent_for_cookies")) {
                if (!((Boolean) tVar.f12230c.zzb(zzbdc.zzaL)).booleanValue() || i11 == -1 || this.zze == i11) {
                    return;
                }
                this.zze = i11;
                zzc(string2, i11);
            }
        } catch (Throwable th2) {
            n.D.f11582h.zzw(th2, "AdMobPlusIdlessListener.onSharedPreferenceChanged");
            l0.l("onSharedPreferenceChanged, errorMessage = ", th2);
        }
    }

    public final void zza() {
        SharedPreferences sharedPreferences = this.zzb;
        sharedPreferences.registerOnSharedPreferenceChangeListener(this);
        onSharedPreferenceChanged(sharedPreferences, "gad_has_consent_for_cookies");
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzaN)).booleanValue()) {
            onSharedPreferenceChanged(sharedPreferences, "IABTCF_TCString");
        } else {
            onSharedPreferenceChanged(sharedPreferences, "IABTCF_PurposeConsents");
        }
    }
}
