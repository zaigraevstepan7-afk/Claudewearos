package u6;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class z implements f7.g, f7.f {
    public static final TreeMap B = new TreeMap();
    public int A;

    /* renamed from: a, reason: collision with root package name */
    public final int f16804a;

    /* renamed from: b, reason: collision with root package name */
    public volatile String f16805b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f16806c;

    /* renamed from: d, reason: collision with root package name */
    public final double[] f16807d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f16808e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[][] f16809f;

    /* renamed from: z, reason: collision with root package name */
    public final int[] f16810z;

    public z(int i10) {
        this.f16804a = i10;
        int i11 = i10 + 1;
        this.f16810z = new int[i11];
        this.f16806c = new long[i11];
        this.f16807d = new double[i11];
        this.f16808e = new String[i11];
        this.f16809f = new byte[i11][];
    }

    public static final z g(int i10, String str) {
        TreeMap treeMap = B;
        synchronized (treeMap) {
            Map.Entry entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i10));
            if (entryCeilingEntry == null) {
                z zVar = new z(i10);
                zVar.f16805b = str;
                zVar.A = i10;
                return zVar;
            }
            treeMap.remove(entryCeilingEntry.getKey());
            z zVar2 = (z) entryCeilingEntry.getValue();
            zVar2.f16805b = str;
            zVar2.A = i10;
            return zVar2;
        }
    }

    @Override // f7.f
    public final void E(int i10, byte[] bArr) {
        this.f16810z[i10] = 5;
        this.f16809f[i10] = bArr;
    }

    @Override // f7.f
    public final void R(int i10) {
        this.f16810z[i10] = 1;
    }

    @Override // f7.g
    public final String b() {
        String str = this.f16805b;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // f7.g
    public final void e(f7.f fVar) {
        int i10 = this.A;
        if (1 > i10) {
            return;
        }
        int i11 = 1;
        while (true) {
            int i12 = this.f16810z[i11];
            if (i12 == 1) {
                fVar.R(i11);
            } else if (i12 == 2) {
                fVar.v(i11, this.f16806c[i11]);
            } else if (i12 == 3) {
                fVar.o(i11, this.f16807d[i11]);
            } else if (i12 == 4) {
                String str = this.f16808e[i11];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                fVar.k(i11, str);
            } else if (i12 == 5) {
                byte[] bArr = this.f16809f[i11];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                fVar.E(i11, bArr);
            }
            if (i11 == i10) {
                return;
            } else {
                i11++;
            }
        }
    }

    @Override // f7.f
    public final void k(int i10, String str) {
        fj.l.f(str, "value");
        this.f16810z[i10] = 4;
        this.f16808e[i10] = str;
    }

    public final void l() {
        TreeMap treeMap = B;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f16804a), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                fj.l.e(it, "iterator(...)");
                while (true) {
                    int i10 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i10;
                }
            }
        }
    }

    @Override // f7.f
    public final void o(int i10, double d10) {
        this.f16810z[i10] = 3;
        this.f16807d[i10] = d10;
    }

    @Override // f7.f
    public final void v(int i10, long j) {
        this.f16810z[i10] = 2;
        this.f16806c[i10] = j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
