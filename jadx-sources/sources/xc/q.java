package xc;

import com.google.android.gms.internal.ads.zzhfy;
import com.google.android.gms.internal.ads.zzhgg;
import java.util.HashSet;
import java.util.Locale;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class q implements zzhfy {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20005a;

    /* renamed from: b, reason: collision with root package name */
    public final n f20006b;

    public /* synthetic */ q(n nVar, int i10) {
        this.f20005a = i10;
        this.f20006b = nVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    public final Object zzb() {
        switch (this.f20005a) {
            case 0:
                String lowerCase = this.f20006b.f19992a.toLowerCase(Locale.ROOT);
                zzhgg.zzb(lowerCase);
                return lowerCase;
            case 1:
                n nVar = this.f20006b;
                nVar.getClass();
                HashSet hashSet = new HashSet();
                hashSet.add(nVar.f19992a.toLowerCase(Locale.ROOT));
                return hashSet;
            case 2:
                return this.f20006b.f19993b;
            default:
                return this.f20006b.f19994c;
        }
    }
}
