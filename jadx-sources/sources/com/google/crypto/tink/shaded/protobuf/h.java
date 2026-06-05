package com.google.crypto.tink.shaded.protobuf;

import java.util.Iterator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public class h extends i {

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f4169d;

    public h(byte[] bArr) {
        this.f4173a = 0;
        bArr.getClass();
        this.f4169d = bArr;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.i
    public byte b(int i10) {
        return this.f4169d[i10];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i) || size() != ((i) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof h)) {
            return obj.equals(this);
        }
        h hVar = (h) obj;
        int i10 = this.f4173a;
        int i11 = hVar.f4173a;
        if (i10 != 0 && i11 != 0 && i10 != i11) {
            return false;
        }
        int size = size();
        if (size > hVar.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > hVar.size()) {
            StringBuilder sbP = gk.b.p(size, "Ran off end of other: 0, ", ", ");
            sbP.append(hVar.size());
            throw new IllegalArgumentException(sbP.toString());
        }
        byte[] bArr = hVar.f4169d;
        int iY = y() + size;
        int iY2 = y();
        int iY3 = hVar.y();
        while (iY2 < iY) {
            if (this.f4169d[iY2] != bArr[iY3]) {
                return false;
            }
            iY2++;
            iY3++;
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new androidx.datastore.preferences.protobuf.d(this);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.i
    public int size() {
        return this.f4169d.length;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.i
    public void w(int i10, byte[] bArr) {
        System.arraycopy(this.f4169d, 0, bArr, 0, i10);
    }

    public int y() {
        return 0;
    }

    public byte z(int i10) {
        return this.f4169d[i10];
    }
}
