package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.util.Log;
import lf.d;
import lf.e;
import lf.f;
import lf.g;
import lf.h;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzj {
    private final zzaq zza;
    private final zzw zzb;
    private final zzbo zzc;
    private final Object zzd = new Object();
    private final Object zze = new Object();
    private boolean zzf = false;
    private boolean zzg = false;
    private g zzh = new g();

    public zzj(zzaq zzaqVar, zzw zzwVar, zzbo zzboVar) {
        this.zza = zzaqVar;
        this.zzb = zzwVar;
        this.zzc = zzboVar;
    }

    public final boolean canRequestAds() {
        zzaq zzaqVar = this.zza;
        if (!zzaqVar.zzk()) {
            int iZza = !zzc() ? 0 : zzaqVar.zza();
            if (iZza != 1 && iZza != 3) {
                return false;
            }
        }
        return true;
    }

    public final int getConsentStatus() {
        if (zzc()) {
            return this.zza.zza();
        }
        return 0;
    }

    public final f getPrivacyOptionsRequirementStatus() {
        return !zzc() ? f.f10932a : this.zza.zzb();
    }

    public final boolean isConsentFormAvailable() {
        return this.zzc.zzf();
    }

    public final void requestConsentInfoUpdate(Activity activity, g gVar, e eVar, d dVar) {
        synchronized (this.zzd) {
            this.zzf = true;
        }
        this.zzh = gVar;
        this.zzb.zzc(activity, gVar, eVar, dVar);
    }

    public final void reset() {
        this.zzc.zzd(null);
        this.zza.zze();
        synchronized (this.zzd) {
            this.zzf = false;
        }
    }

    public final void zza(Activity activity) {
        if (zzc() && !zzd()) {
            zzb(true);
            this.zzb.zzc(activity, this.zzh, new e() { // from class: com.google.android.gms.internal.consent_sdk.zzh
                @Override // lf.e
                public final void onConsentInfoUpdateSuccess() {
                    this.zza.zzb(false);
                }
            }, new d() { // from class: com.google.android.gms.internal.consent_sdk.zzi
                @Override // lf.d
                public final void onConsentInfoUpdateFailure(h hVar) {
                    this.zza.zzb(false);
                }
            });
            return;
        }
        Log.w("UserMessagingPlatform", "Retry request is not executed. consentInfoUpdateHasBeenCalled=" + zzc() + ", retryRequestIsInProgress=" + zzd());
    }

    public final void zzb(boolean z2) {
        synchronized (this.zze) {
            this.zzg = z2;
        }
    }

    public final boolean zzc() {
        boolean z2;
        synchronized (this.zzd) {
            z2 = this.zzf;
        }
        return z2;
    }

    public final boolean zzd() {
        boolean z2;
        synchronized (this.zze) {
            z2 = this.zzg;
        }
        return z2;
    }
}
