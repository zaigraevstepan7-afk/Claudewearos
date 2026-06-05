package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import android.os.Build;
import c2.s0;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzaxj extends zzayi {
    private static final zzayj zzh = new zzayj();
    private final zzasn zzi;
    private final Context zzj;
    private final zzaun zzk;

    public zzaxj(zzawv zzawvVar, String str, String str2, zzasr zzasrVar, int i10, int i11, Context context, zzase zzaseVar, zzasn zzasnVar, zzaun zzaunVar) {
        super(zzawvVar, "5l2BxulTXy+0Wovy9T0xreNvMgccuxz9Mfzqj2nIzDWreku9cf/hyHYbFP2gke7n", "rfz55QLsxMWzB2XqDjYWCElC2tXCWyMh5Hq3cP2KfWk=", zzasrVar, i10, 27);
        this.zzj = context;
        this.zzi = zzasnVar;
        this.zzk = zzaunVar;
    }

    private final zzauk zzc() {
        int iZza;
        String str;
        zzbct zzbctVar = zzbdc.zzcU;
        t tVar = t.f12227d;
        if (((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue()) {
            iZza = ((Integer) tVar.f12230c.zzb(zzbdc.zzcZ)).intValue();
        } else {
            iZza = this.zzi.zza();
        }
        zzauk zzaukVar = new zzauk((String) this.zze.invoke(null, this.zzj, Boolean.FALSE, ""));
        zzaun zzaunVar = this.zzk;
        if (zzaunVar == null || zzaunVar.zza() == null) {
            str = "E";
        } else {
            try {
                str = (String) zzaunVar.zza().get(iZza, TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            }
        }
        zzaukVar.zza = str;
        return zzaukVar;
    }

    private final String zzd() throws ExecutionException, InterruptedException {
        try {
            zzawv zzawvVar = this.zza;
            if (zzawvVar.zzk() != null) {
                zzawvVar.zzk().get();
            }
            zzato zzatoVarZzc = zzawvVar.zzc();
            if (zzatoVarZzc == null || !zzatoVarZzc.zzaf()) {
                return null;
            }
            return zzatoVarZzc.zzg();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzayi
    public final void zza() {
        int i10;
        zzauk zzaukVarZzc;
        zzauk zzaukVar;
        zzayj zzayjVar = zzh;
        Context context = this.zzj;
        AtomicReference atomicReferenceZza = zzayjVar.zza(context.getPackageName());
        synchronized (atomicReferenceZza) {
            try {
                zzauk zzaukVar2 = (zzauk) atomicReferenceZza.get();
                if (zzaukVar2 == null || zzawy.zzd(zzaukVar2.zza) || zzaukVar2.zza.equals("E") || zzaukVar2.zza.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                    if (zzawy.zzd(null)) {
                        zzawy.zzd(null);
                        i10 = 3;
                    } else {
                        i10 = 5;
                    }
                    if (this.zzk != null) {
                        zzaukVarZzc = zzc();
                    } else {
                        boolean z2 = false;
                        if (i10 == 3 && !this.zzi.zzd()) {
                            z2 = true;
                        }
                        Boolean boolValueOf = Boolean.valueOf(z2);
                        zzbct zzbctVar = zzbdc.zzcI;
                        t tVar = t.f12227d;
                        Boolean bool = (Boolean) tVar.f12230c.zzb(zzbctVar);
                        String strZzb = ((Boolean) tVar.f12230c.zzb(zzbdc.zzcH)).booleanValue() ? zzb() : null;
                        if (bool.booleanValue() && this.zza.zzo() && zzawy.zzd(strZzb)) {
                            strZzb = zzd();
                        }
                        zzauk zzaukVar3 = new zzauk((String) this.zze.invoke(null, context, boolValueOf, strZzb));
                        if (zzawy.zzd(zzaukVar3.zza) || zzaukVar3.zza.equals("E")) {
                            int i11 = i10 - 1;
                            if (i11 == 3) {
                                String strZzd = zzd();
                                if (!zzawy.zzd(strZzd)) {
                                    zzaukVar3.zza = strZzd;
                                }
                            } else if (i11 == 4) {
                                throw null;
                            }
                        }
                        zzaukVarZzc = zzaukVar3;
                    }
                    atomicReferenceZza.set(zzaukVarZzc);
                }
                zzaukVar = (zzauk) atomicReferenceZza.get();
            } finally {
            }
        }
        zzasr zzasrVar = this.zzd;
        synchronized (zzasrVar) {
            if (zzaukVar != null) {
                try {
                    zzasrVar.zzv(zzaukVar.zza);
                    zzasrVar.zzV(zzaukVar.zzb);
                    zzasrVar.zzX(zzaukVar.zzc);
                    zzasrVar.zzi(zzaukVar.zzd);
                    zzasrVar.zzu(zzaukVar.zze);
                } finally {
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [com.google.android.gms.internal.ads.zzayk] */
    public final String zzb() throws PackageManager.NameNotFoundException, CertificateException {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            zzbct zzbctVar = zzbdc.zzcJ;
            t tVar = t.f12227d;
            byte[] bArrZzf = zzawy.zzf((String) tVar.f12230c.zzb(zzbctVar));
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(bArrZzf)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(zzawy.zzf((String) tVar.f12230c.zzb(zzbdc.zzcK)))));
            }
            Context context = this.zzj;
            String packageName = context.getPackageName();
            this.zza.zzj();
            if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals("S")) {
                return null;
            }
            final zzgdv zzgdvVarZze = zzgdv.zze();
            context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new PackageManager$OnChecksumsReadyListener() { // from class: com.google.android.gms.internal.ads.zzayk
                public final void onChecksumsReady(List list) {
                    zzgdv zzgdvVar = zzgdvVarZze;
                    if (list == null) {
                        zzgdvVar.zzc(null);
                        return;
                    }
                    try {
                        int size = list.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            ApkChecksum apkChecksumB = s0.b(list.get(i10));
                            if (apkChecksumB.getType() == 8) {
                                zzgdvVar.zzc(zzawy.zzb(apkChecksumB.getValue()));
                                return;
                            }
                        }
                        zzgdvVar.zzc(null);
                    } catch (Throwable unused) {
                        zzgdvVar.zzc(null);
                    }
                }
            });
            return (String) zzgdvVarZze.get();
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }
}
