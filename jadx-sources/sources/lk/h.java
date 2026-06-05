package lk;

import fj.l;
import java.util.ArrayList;
import kk.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final t f11017a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11018b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11019c;

    /* renamed from: d, reason: collision with root package name */
    public final long f11020d;

    /* renamed from: e, reason: collision with root package name */
    public final long f11021e;

    /* renamed from: f, reason: collision with root package name */
    public final long f11022f;

    /* renamed from: g, reason: collision with root package name */
    public final int f11023g;

    /* renamed from: h, reason: collision with root package name */
    public final long f11024h;

    /* renamed from: i, reason: collision with root package name */
    public final int f11025i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final Long f11026k;

    /* renamed from: l, reason: collision with root package name */
    public final Long f11027l;

    /* renamed from: m, reason: collision with root package name */
    public final Long f11028m;

    /* renamed from: n, reason: collision with root package name */
    public final Integer f11029n;

    /* renamed from: o, reason: collision with root package name */
    public final Integer f11030o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f11031p;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f11032q;

    public h(t tVar, boolean z2, String str, long j, long j4, long j10, int i10, long j11, int i11, int i12, Long l10, Long l11, Long l12, Integer num, Integer num2, Integer num3) {
        l.f(tVar, "canonicalPath");
        l.f(str, "comment");
        this.f11017a = tVar;
        this.f11018b = z2;
        this.f11019c = str;
        this.f11020d = j;
        this.f11021e = j4;
        this.f11022f = j10;
        this.f11023g = i10;
        this.f11024h = j11;
        this.f11025i = i11;
        this.j = i12;
        this.f11026k = l10;
        this.f11027l = l11;
        this.f11028m = l12;
        this.f11029n = num;
        this.f11030o = num2;
        this.f11031p = num3;
        this.f11032q = new ArrayList();
    }

    public /* synthetic */ h(t tVar, boolean z2, String str, long j, long j4, long j10, int i10, long j11, int i11, int i12, Long l10, Long l11, Long l12, int i13) {
        this(tVar, z2, (i13 & 4) != 0 ? "" : str, (i13 & 8) != 0 ? -1L : j, (i13 & 16) != 0 ? -1L : j4, (i13 & 32) != 0 ? -1L : j10, (i13 & 64) != 0 ? -1 : i10, (i13 & 128) != 0 ? -1L : j11, (i13 & 256) != 0 ? -1 : i11, (i13 & 512) != 0 ? -1 : i12, (i13 & 1024) != 0 ? null : l10, (i13 & 2048) != 0 ? null : l11, (i13 & 4096) != 0 ? null : l12, null, null, null);
    }
}
