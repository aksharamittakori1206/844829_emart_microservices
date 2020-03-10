import { SubCategory } from './Subcategory';

export interface Item{
  /*  id: number,
    name: string,
    categoryId: number,
    subCategoryId: number,
    price:number,
    description: string,
    stock: number,
    remarks: string,
    img: string ,*/
    itemId: number,
    itemName: string,
    itemPrice:number,
    itemDescription: string,
    itemStock: number,
    itemRemarks: string,
    itemImage: string
}
