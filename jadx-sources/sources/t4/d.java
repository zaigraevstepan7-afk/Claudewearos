package t4;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d implements c, e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15711a = 0;

    /* renamed from: b, reason: collision with root package name */
    public ClipData f15712b;

    /* renamed from: c, reason: collision with root package name */
    public int f15713c;

    /* renamed from: d, reason: collision with root package name */
    public int f15714d;

    /* renamed from: e, reason: collision with root package name */
    public Uri f15715e;

    /* renamed from: f, reason: collision with root package name */
    public Bundle f15716f;

    public /* synthetic */ d() {
    }

    @Override // t4.e
    public ContentInfo a() {
        return null;
    }

    @Override // t4.e
    public ClipData b() {
        return this.f15712b;
    }

    @Override // t4.c
    public f build() {
        return new f(new d(this));
    }

    @Override // t4.c
    public void d(Uri uri) {
        this.f15715e = uri;
    }

    @Override // t4.c
    public void e(int i10) {
        this.f15714d = i10;
    }

    @Override // t4.e
    public int o() {
        return this.f15714d;
    }

    @Override // t4.e
    public int r() {
        return this.f15713c;
    }

    @Override // t4.c
    public void setExtras(Bundle bundle) {
        this.f15716f = bundle;
    }

    public String toString() {
        String str;
        switch (this.f15711a) {
            case 1:
                Uri uri = this.f15715e;
                StringBuilder sb2 = new StringBuilder("ContentInfoCompat{clip=");
                sb2.append(this.f15712b.getDescription());
                sb2.append(", source=");
                int i10 = this.f15713c;
                sb2.append(i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? String.valueOf(i10) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb2.append(", flags=");
                int i11 = this.f15714d;
                sb2.append((i11 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i11));
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb2.append(str);
                return m6.a.j(sb2, this.f15716f != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    public d(d dVar) {
        ClipData clipData = dVar.f15712b;
        clipData.getClass();
        this.f15712b = clipData;
        int i10 = dVar.f15713c;
        if (i10 < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i10 > 5) {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
        }
        this.f15713c = i10;
        int i11 = dVar.f15714d;
        if ((i11 & 1) == i11) {
            this.f15714d = i11;
            this.f15715e = dVar.f15715e;
            this.f15716f = dVar.f15716f;
        } else {
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i11) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        }
    }
}
