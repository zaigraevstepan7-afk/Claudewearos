package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f911a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f912b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final int f913c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f914d;

    public d(g gVar) {
        this.f914d = gVar;
        this.f913c = gVar.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f911a) {
            case 0:
                if (this.f912b < this.f913c) {
                }
                break;
            default:
                if (this.f912b < this.f913c) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f911a) {
            case 0:
                int i10 = this.f912b;
                if (i10 >= this.f913c) {
                    throw new NoSuchElementException();
                }
                this.f912b = i10 + 1;
                return Byte.valueOf(((g) this.f914d).y(i10));
            default:
                int i11 = this.f912b;
                if (i11 >= this.f913c) {
                    throw new NoSuchElementException();
                }
                this.f912b = i11 + 1;
                return Byte.valueOf(((com.google.crypto.tink.shaded.protobuf.h) this.f914d).z(i11));
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f911a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public d(com.google.crypto.tink.shaded.protobuf.h hVar) {
        this.f914d = hVar;
        this.f913c = hVar.size();
    }
}
