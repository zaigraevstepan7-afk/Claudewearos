package ah;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f457a;

    /* renamed from: b, reason: collision with root package name */
    public int f458b;

    public static int f(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            char cCharAt = charSequence.charAt(i10);
            if (cCharAt <= '\u007f') {
                i11++;
            } else if (cCharAt <= '\u07ff') {
                i11 += 2;
            } else if (Character.isHighSurrogate(cCharAt)) {
                i11 += 4;
                i10++;
            } else {
                i11 += 3;
            }
            i10++;
        }
        return i11;
    }

    @Override // ah.b
    public boolean a(byte[] bArr) {
        this.f457a.add(bArr);
        this.f458b += bArr.length;
        return true;
    }

    @Override // ah.b
    public g b() {
        ArrayList arrayList = this.f457a;
        byte[] bArr = new byte[this.f458b];
        int length = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            byte[] bArr2 = (byte[]) arrayList.get(i10);
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return new g();
    }

    public void c() {
        String string;
        ArrayList arrayList = this.f457a;
        if (this.f458b > 768) {
            throw new mg.c(m6.a.h(new StringBuilder("Data has a key path longer than 768 bytes ("), this.f458b, ")."));
        }
        if (arrayList.size() > 32) {
            StringBuilder sb2 = new StringBuilder("Path specified exceeds the maximum depth that can be written (32) or object contains a cycle ");
            if (arrayList.size() != 0) {
                StringBuilder sb3 = new StringBuilder("in path '");
                StringBuilder sb4 = new StringBuilder();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (i10 > 0) {
                        sb4.append("/");
                    }
                    sb4.append((String) arrayList.get(i10));
                }
                sb3.append(sb4.toString());
                sb3.append("'");
                string = sb3.toString();
            } else {
                string = "";
            }
            sb2.append(string);
            throw new mg.c(sb2.toString());
        }
    }

    public void d() {
        ArrayList arrayList = this.f457a;
        this.f458b -= f((String) arrayList.remove(arrayList.size() - 1));
        if (arrayList.size() > 0) {
            this.f458b--;
        }
    }

    public void e(String str) {
        ArrayList arrayList = this.f457a;
        if (arrayList.size() > 0) {
            this.f458b++;
        }
        arrayList.add(str);
        this.f458b = f(str) + this.f458b;
        c();
    }

    public void g(Object obj) {
        if (obj instanceof Map) {
            Map map = (Map) obj;
            for (String str : map.keySet()) {
                if (!str.startsWith(".")) {
                    e(str);
                    g(map.get(str));
                    d();
                }
            }
            return;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            for (int i10 = 0; i10 < list.size(); i10++) {
                e(Integer.toString(i10));
                g(list.get(i10));
                d();
            }
        }
    }
}
