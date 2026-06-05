package qc;

import com.google.android.gms.internal.ads.zzarg;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class v extends zzarg {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte[] f13467a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f13468b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ rc.h f13469c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(int i10, String str, w wVar, t0.j jVar, byte[] bArr, Map map, rc.h hVar) {
        super(i10, str, wVar, jVar);
        this.f13467a = bArr;
        this.f13468b = map;
        this.f13469c = hVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaqb
    public final Map zzl() {
        Map map = this.f13468b;
        return map == null ? Collections.EMPTY_MAP : map;
    }

    @Override // com.google.android.gms.internal.ads.zzaqb
    public final byte[] zzx() {
        byte[] bArr = this.f13467a;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzarg, com.google.android.gms.internal.ads.zzaqb
    /* renamed from: zzz */
    public final void zzo(String str) throws IOException {
        if (rc.h.c() && str != null) {
            this.f13469c.d("onNetworkResponseBody", new d8.e(str.getBytes()));
        }
        super.zzo(str);
    }
}
