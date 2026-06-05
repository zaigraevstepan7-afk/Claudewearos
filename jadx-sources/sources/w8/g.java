package w8;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f18950a;

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f18951b;

    /* renamed from: c, reason: collision with root package name */
    public final String f18952c;

    /* renamed from: d, reason: collision with root package name */
    public final String f18953d;

    /* renamed from: e, reason: collision with root package name */
    public final String f18954e;

    /* renamed from: f, reason: collision with root package name */
    public final String f18955f;

    /* renamed from: g, reason: collision with root package name */
    public final String f18956g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f18957h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f18958i;

    public g(String str) {
        this.f18950a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f18951b = jSONObject;
        String strOptString = jSONObject.optString("productId");
        this.f18952c = strOptString;
        String strOptString2 = jSONObject.optString("type");
        this.f18953d = strOptString2;
        if (TextUtils.isEmpty(strOptString)) {
            throw new IllegalArgumentException("Product id cannot be empty.");
        }
        if (TextUtils.isEmpty(strOptString2)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.f18954e = jSONObject.optString("title");
        jSONObject.optString("name");
        jSONObject.optString("description");
        jSONObject.optString("packageDisplayName");
        jSONObject.optString("iconUrl");
        this.f18955f = jSONObject.optString("skuDetailsToken");
        this.f18956g = jSONObject.optString("serializedDocid");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                arrayList.add(new f(jSONArrayOptJSONArray.getJSONObject(i10)));
            }
            this.f18957h = arrayList;
        } else {
            this.f18957h = (strOptString2.equals("subs") || strOptString2.equals("play_pass_subs")) ? new ArrayList() : null;
        }
        JSONObject jSONObjectOptJSONObject = this.f18951b.optJSONObject("oneTimePurchaseOfferDetails");
        JSONArray jSONArrayOptJSONArray2 = this.f18951b.optJSONArray("oneTimePurchaseOfferDetailsList");
        ArrayList arrayList2 = new ArrayList();
        if (jSONArrayOptJSONArray2 != null) {
            for (int i11 = 0; i11 < jSONArrayOptJSONArray2.length(); i11++) {
                arrayList2.add(new e(jSONArrayOptJSONArray2.getJSONObject(i11)));
            }
            this.f18958i = arrayList2;
            return;
        }
        if (jSONObjectOptJSONObject == null) {
            this.f18958i = null;
        } else {
            arrayList2.add(new e(jSONObjectOptJSONObject));
            this.f18958i = arrayList2;
        }
    }

    public final e a() {
        ArrayList arrayList = this.f18958i;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        return (e) arrayList.get(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            return TextUtils.equals(this.f18950a, ((g) obj).f18950a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18950a.hashCode();
    }

    public final String toString() {
        String string = this.f18951b.toString();
        String strValueOf = String.valueOf(this.f18957h);
        StringBuilder sb2 = new StringBuilder("ProductDetails{jsonString='");
        m1.s(sb2, this.f18950a, "', parsedJson=", string, ", productId='");
        sb2.append(this.f18952c);
        sb2.append("', productType='");
        sb2.append(this.f18953d);
        sb2.append("', title='");
        sb2.append(this.f18954e);
        sb2.append("', productDetailsToken='");
        sb2.append(this.f18955f);
        sb2.append("', subscriptionOfferDetails=");
        sb2.append(strValueOf);
        sb2.append("}");
        return sb2.toString();
    }
}
