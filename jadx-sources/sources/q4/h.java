package q4;

import android.net.Uri;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f13226a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13227b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13228c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f13229d;

    /* renamed from: e, reason: collision with root package name */
    public final String f13230e;

    /* renamed from: f, reason: collision with root package name */
    public final int f13231f;

    public h(Uri uri, int i10, int i11, boolean z2, int i12) {
        uri.getClass();
        this.f13226a = uri;
        this.f13227b = i10;
        this.f13228c = i11;
        this.f13229d = z2;
        this.f13230e = null;
        this.f13231f = i12;
    }

    public h(String str, String str2) {
        this.f13226a = new Uri.Builder().scheme("systemfont").authority(str).build();
        this.f13227b = 0;
        this.f13228c = 400;
        this.f13229d = false;
        this.f13230e = str2;
        this.f13231f = 0;
    }
}
