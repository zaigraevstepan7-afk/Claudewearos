package pf;

import androidx.datastore.preferences.protobuf.j;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class d extends e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f12878c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(byte[] bArr, int i10) {
        super(bArr);
        this.f12878c = i10;
    }

    @Override // pf.e
    public final j g(int i10, byte[] bArr) {
        switch (this.f12878c) {
            case 0:
                return new c(bArr, i10, 0);
            default:
                return new c(bArr, i10, 1);
        }
    }
}
