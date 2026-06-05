package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.util.Log;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import lf.b;
import lf.c;
import lf.f;
import lf.h;
import lf.i;
import lf.j;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbo {
    private final zzdt zza;
    private final Executor zzb;
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();

    public zzbo(zzdt zzdtVar, Executor executor) {
        this.zza = zzdtVar;
        this.zzb = executor;
    }

    public static /* synthetic */ void zza(zzbo zzboVar, zzbc zzbcVar) {
        final AtomicReference atomicReference = zzboVar.zzd;
        Objects.requireNonNull(atomicReference);
        zzbcVar.zzf(new j() { // from class: com.google.android.gms.internal.consent_sdk.zzbf
            @Override // lf.j
            public final void onConsentFormLoadSuccess(c cVar) {
                atomicReference.set(cVar);
            }
        }, new i() { // from class: com.google.android.gms.internal.consent_sdk.zzbg
            @Override // lf.i
            public final void onConsentFormLoadFailure(h hVar) {
                Log.e("UserMessagingPlatform", "Failed to load and cache a form, error=".concat(String.valueOf(hVar.f10936a)));
            }
        });
    }

    public final void zzb(j jVar, i iVar) {
        zzcs.zza();
        zzbq zzbqVar = (zzbq) this.zzc.get();
        if (zzbqVar == null) {
            iVar.onConsentFormLoadFailure(new zzg(3, "No available form can be built.").zza());
        } else {
            ((zzaw) this.zza.zza()).zza(zzbqVar).zzb().zza().zzf(jVar, iVar);
        }
    }

    public final void zzc() {
        zzbq zzbqVar = (zzbq) this.zzc.get();
        if (zzbqVar == null) {
            Log.e("UserMessagingPlatform", "Failed to load and cache a form due to null consent form resources.");
            return;
        }
        final zzbc zzbcVarZza = ((zzaw) this.zza.zza()).zza(zzbqVar).zzb().zza();
        zzbcVarZza.zza = true;
        zzcs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbe
            @Override // java.lang.Runnable
            public final void run() {
                zzbo.zza(this.zza, zzbcVarZza);
            }
        });
    }

    public final void zzd(zzbq zzbqVar) {
        this.zzc.set(zzbqVar);
    }

    public final void zze(Activity activity, final b bVar) {
        zzcs.zza();
        zzj zzjVarZzb = zza.zza(activity).zzb();
        if (zzjVarZzb == null) {
            zzcs.zza.post(new Runnable(bVar) { // from class: com.google.android.gms.internal.consent_sdk.zzbh
                public final /* synthetic */ b zza;

                @Override // java.lang.Runnable
                public final void run() {
                    new zzg(1, "No consentInformation.").zza();
                    throw null;
                }
            });
            return;
        }
        boolean zIsConsentFormAvailable = zzjVarZzb.isConsentFormAvailable();
        f fVar = f.f10933b;
        if (!zIsConsentFormAvailable && zzjVarZzb.getPrivacyOptionsRequirementStatus() != fVar) {
            zzcs.zza.post(new Runnable(bVar) { // from class: com.google.android.gms.internal.consent_sdk.zzbi
                public final /* synthetic */ b zza;

                @Override // java.lang.Runnable
                public final void run() {
                    new zzg(3, "No valid response received yet.").zza();
                    throw null;
                }
            });
            zzjVarZzb.zza(activity);
        } else {
            if (zzjVarZzb.getPrivacyOptionsRequirementStatus() == fVar) {
                zzcs.zza.post(new Runnable(bVar) { // from class: com.google.android.gms.internal.consent_sdk.zzbj
                    public final /* synthetic */ b zza;

                    @Override // java.lang.Runnable
                    public final void run() {
                        new zzg(3, "Privacy options form is not required.").zza();
                        throw null;
                    }
                });
                return;
            }
            c cVar = (c) this.zzd.get();
            if (cVar == null) {
                zzcs.zza.post(new Runnable(bVar) { // from class: com.google.android.gms.internal.consent_sdk.zzbk
                    public final /* synthetic */ b zza;

                    @Override // java.lang.Runnable
                    public final void run() {
                        new zzg(3, "Privacy options form is being loading. Please try again later.").zza();
                        throw null;
                    }
                });
            } else {
                cVar.show(activity, bVar);
                this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbl
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzc();
                    }
                });
            }
        }
    }

    public final boolean zzf() {
        return this.zzc.get() != null;
    }
}
