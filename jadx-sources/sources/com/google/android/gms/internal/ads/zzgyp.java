package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgyp;
import com.google.android.gms.internal.ads.zzgyv;
import java.io.IOException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class zzgyp<MessageType extends zzgyv<MessageType, BuilderType>, BuilderType extends zzgyp<MessageType, BuilderType>> extends zzgwv<MessageType, BuilderType> {
    protected MessageType zza;
    private final MessageType zzb;

    public zzgyp(MessageType messagetype) {
        this.zzb = messagetype;
        if (messagetype.zzcd()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = (MessageType) zza();
    }

    private MessageType zza() {
        return (MessageType) this.zzb.zzbj();
    }

    private static <MessageType> void zzb(MessageType messagetype, MessageType messagetype2) {
        zzhaq.zza().zzb(messagetype.getClass()).zzg(messagetype, messagetype2);
    }

    @Override // com.google.android.gms.internal.ads.zzgwv
    public /* bridge */ /* synthetic */ zzgwv zzaD(zzgww zzgwwVar) {
        zzbi((zzgyv) zzgwwVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgwv
    /* renamed from: zzaK */
    public /* bridge */ /* synthetic */ zzgwv zzaW(zzgxt zzgxtVar, zzgyf zzgyfVar) throws IOException {
        zzbk(zzgxtVar, zzgyfVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgwv
    /* renamed from: zzaN */
    public /* bridge */ /* synthetic */ zzgwv zzaZ(byte[] bArr, int i10, int i11) throws zzgzk {
        zzbl(bArr, i10, i11);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgwv
    /* renamed from: zzaO */
    public /* bridge */ /* synthetic */ zzgwv zzba(byte[] bArr, int i10, int i11, zzgyf zzgyfVar) throws zzgzk {
        zzbm(bArr, i10, i11, zzgyfVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgwv
    public /* bridge */ /* synthetic */ zzhaf zzaW(zzgxt zzgxtVar, zzgyf zzgyfVar) throws IOException {
        zzbk(zzgxtVar, zzgyfVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgwv
    public /* bridge */ /* synthetic */ zzhaf zzaZ(byte[] bArr, int i10, int i11) throws zzgzk {
        zzbl(bArr, i10, i11);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgwv
    public /* bridge */ /* synthetic */ zzhaf zzba(byte[] bArr, int i10, int i11, zzgyf zzgyfVar) throws zzgzk {
        zzbm(bArr, i10, i11, zzgyfVar);
        return this;
    }

    public final BuilderType zzbg() {
        if (this.zzb.zzcd()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = (MessageType) zza();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgwv
    /* renamed from: zzbh, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public BuilderType zzaP() {
        BuilderType buildertype = (BuilderType) zzbt().zzcY();
        buildertype.zza = (MessageType) zzbs();
        return buildertype;
    }

    public BuilderType zzbi(MessageType messagetype) {
        zzbj(messagetype);
        return this;
    }

    public BuilderType zzbj(MessageType messagetype) {
        if (zzbt().equals(messagetype)) {
            return this;
        }
        zzbu();
        zzb(this.zza, messagetype);
        return this;
    }

    public BuilderType zzbk(zzgxt zzgxtVar, zzgyf zzgyfVar) throws IOException {
        zzbu();
        try {
            zzhaq.zza().zzb(this.zza.getClass()).zzh(this.zza, zzgxu.zzq(zzgxtVar), zzgyfVar);
            return this;
        } catch (RuntimeException e10) {
            if (e10.getCause() instanceof IOException) {
                throw ((IOException) e10.getCause());
            }
            throw e10;
        }
    }

    public BuilderType zzbl(byte[] bArr, int i10, int i11) throws zzgzk {
        int i12 = zzgyf.zzb;
        int i13 = zzhaq.zza;
        zzbm(bArr, i10, i11, zzgyf.zza);
        return this;
    }

    public BuilderType zzbm(byte[] bArr, int i10, int i11, zzgyf zzgyfVar) throws zzgzk {
        zzbu();
        try {
            zzhaq.zza().zzb(this.zza.getClass()).zzi(this.zza, bArr, i10, i10 + i11, new zzgxb(zzgyfVar));
            return this;
        } catch (zzgzk e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e11);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzgzk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    /* renamed from: zzbn, reason: merged with bridge method [inline-methods] */
    public final MessageType zzbr() {
        MessageType messagetype = (MessageType) zzbs();
        if (messagetype.zzbw()) {
            return messagetype;
        }
        throw zzgwv.zzbb(messagetype);
    }

    @Override // com.google.android.gms.internal.ads.zzhaf
    /* renamed from: zzbo, reason: merged with bridge method [inline-methods] */
    public MessageType zzbs() {
        if (!this.zza.zzcd()) {
            return this.zza;
        }
        this.zza.zzbU();
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhah
    /* renamed from: zzbp, reason: merged with bridge method [inline-methods] */
    public MessageType zzbt() {
        return this.zzb;
    }

    public /* bridge */ /* synthetic */ zzhaf zzbq() {
        zzbg();
        return this;
    }

    public final void zzbu() {
        if (this.zza.zzcd()) {
            return;
        }
        zzbv();
    }

    public void zzbv() {
        MessageType messagetype = (MessageType) zza();
        zzb(messagetype, this.zza);
        this.zza = messagetype;
    }

    @Override // com.google.android.gms.internal.ads.zzhah
    public final boolean zzbw() {
        return zzgyv.zzk(this.zza, false);
    }
}
